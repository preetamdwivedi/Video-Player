package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView vm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vm = (VideoView) findViewById(R.id.videoView);

        vm.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video);
        vm.start();

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vm);

        vm.setMediaController(mediaController);
    }
}
