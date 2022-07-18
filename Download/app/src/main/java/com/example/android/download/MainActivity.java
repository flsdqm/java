package com.example.android.download;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    class WebDownloader{
        public void downloader(String url, String fileName){
            try {
                FileUtils.copyURLToFile(new URL(url), new File(fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}