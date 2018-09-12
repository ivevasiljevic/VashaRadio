package com.example.vasha.vasharadio.musicplayer;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.vasha.vasharadio.R;

import java.util.Spliterator;


public class MusicPlayerSplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MusicPlayerSplashActivity.this, MusicPlayerHomeActivity.class));
            }
        }, SPLASH_TIME_OUT);
    }
}