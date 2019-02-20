package com.shoaib.krishidoctor;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import static java.lang.Thread.sleep;

public class SplashActivity extends AppCompatActivity {
    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        Thread timer = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(2000);

                } catch (InterruptedException e) {

                } finally {
                    Intent i = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(i);

                }
            }
        };

        timer.start();

    }
}
