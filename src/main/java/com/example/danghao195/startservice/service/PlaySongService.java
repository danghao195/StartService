package com.example.danghao195.startservice.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import com.example.danghao195.startservice.R;

public class PlaySongService extends Service {

    private MediaPlayer mediaPlayer;

    public PlaySongService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("onCreate is running");
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.when_you_say_nothing_at_all );

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mediaPlayer.start();

        System.out.println("onStartCommand is running");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy is running");
        mediaPlayer.release();

    }
}
