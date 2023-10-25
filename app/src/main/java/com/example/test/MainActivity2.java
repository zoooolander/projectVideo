package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity2 extends AppCompatActivity {
    private VideoView videoView;

    MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        videoView = new VideoView(this);
        videoView = (VideoView) findViewById(R.id.videoView);
        mediaController = new MediaController(this);


        // Retrieve the video resource ID from the intent
        int videoResId = getIntent().getIntExtra("videoResId", 0);
        //Log.d("tag","msg1");
        // Initialize and set up your video player (e.g., using VideoView)
        VideoView videoView = findViewById(R.id.videoView);
        //videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + videoResId));
        //Log.d("tag","msg2");
        videoView.start();

    }


}