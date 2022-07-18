package com.example.android.download;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestThread3 implements Callable<String> {
    private String url;
    private String filename;

    public TestThread3(String url,String filename){
        this.url = url;
        this.filename = filename;
    }

    @Override
    public String call() throws Exception {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,filename);
        System.out.println("下载的文件名为：" + filename);
        return "线程" + filename + "完成下载";
    }

    public static void main(String[] args) {
        TestThread3 t1 = new TestThread3("","1");
        TestThread3 t2 = new TestThread3("","2");
        TestThread3 t3 = new TestThread3("","3");

//        new Thread(t1).start();
//        new Thread(t2).start();
//        new Thread(t3).start();

        ExecutorService service = Executors.newFixedThreadPool(3);
        Future<String> r1 = service.submit(t1);
        Future<String> r2 = service.submit(t2);
        Future<String> r3 = service.submit(t3);

        String res1, res2, res3;
        try {
            res1 = r1.get();
            System.out.println(res1);
            res2 = r2.get();
            System.out.println(res2);
            res3 = r3.get();
            System.out.println(res3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        service.shutdown();
    }
}
