package com.example.android.download;

public class TestThread1 extends Thread{

    private String url;
    private String filename;

    public TestThread1(String url,String filename){
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
        TestThread1 t1 = new TestThread1("","1.jpg");
        TestThread1 t2 = new TestThread1("","2.jpg");
        TestThread1 t3 = new TestThread1("","3.jpg");

        t1.start();
        t2.start();
        t3.start();
    }
}


