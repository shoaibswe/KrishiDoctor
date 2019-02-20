package com.shoaib.krishidoctor;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnkrsk, btnoffcr;
    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnkrsk = findViewById(R.id.btnkrishok);
        btnoffcr = findViewById(R.id.btnofficer);
        btnkrsk.setOnClickListener(this);
        btnoffcr.setOnClickListener(this);

        music = MediaPlayer.create(getApplicationContext(), R.raw.krishidoctor);
        music.start();
        }
    @Override
    public void onClick(View v) {
        Intent nt;
        if (v.getId() == btnkrsk.getId()) {
          nt = new Intent(MainActivity.this, KrishokLoginActivity.class);
            startActivity(nt);
        }
        else if (v.getId() == btnoffcr.getId()) {
           nt = new Intent(MainActivity.this, OfficerLoginActivity.class);
           startActivity(nt);
        }
    }

}
