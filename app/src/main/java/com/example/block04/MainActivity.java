package com.example.block04;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    MediaPlayer myMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myMusic = MediaPlayer.create(this, R.raw.rockabye);

        Switch switch_looping = (Switch) findViewById(R.id.switch_looping);

        switch_looping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                myMusic.setLooping(isChecked);
            }
        });
    }

    public void playMusic(View v) {
        myMusic.start();
    }

    public void pauseMusic(View v) {
        if(myMusic.isPlaying())
            myMusic.pause();
    }
}