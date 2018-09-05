package com.example.danghao195.startservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.danghao195.startservice.service.PlaySongService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playSong(View view) {
        Intent playSongIntent = new Intent(this, PlaySongService.class);
        playSongIntent.putExtra("nhatkey",123);
        startService(playSongIntent);
    }

    public void stopSong(View view) {
        Intent playSongIntent = new Intent(this, PlaySongService.class);
        stopService(playSongIntent);
    }
}
