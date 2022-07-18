package com.example.android.download;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TestThread2 implements Runnable{
    private String url;
    private String filename;

    public TestThread2(String url,String filename){
        this.url = url;
        this.filename = filename;
    }
    //下载图片
    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,filename);
        System.out.println("下载的文件名为：" + filename);
    }

    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2("","1.jpg");
        TestThread2 t2 = new TestThread2("","2.jpg");
        TestThread2 t3 = new TestThread2("","3.jpg");

        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
    }
}

class WebDownloader{
    //下载方法
    public void downloader(String url,String filename){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("出现问题");
        }
    }
}
