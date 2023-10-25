package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.nuwarobotics.service.IClientId;
import com.nuwarobotics.service.agent.NuwaRobotAPI;

//import android.annotation.SuppressLint;
public class MainActivity extends AppCompatActivity {
    Handler handler;
    private NuwaRobotAPI mRobotAPI;
    private IClientId mClientId;
    private final String TAG = this.getClass().getSimpleName();
    private VideoView videoView;
    private Button playBtn, stopBtn, crossBtn;
    private TextView videoPage;
    MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mClientId = new IClientId(this.getPackageName());
//        mRobotAPI = new NuwaRobotAPI(this, mClientId);
//        handler = new Handler();
//
//        crossBtn.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish();
//
//            }
//        });
//
//
//        handler.postDelayed(new Runnable() {
//            public void run() {
//                // yourMethod();
//                // kebbi臉 + 講話
//
//                showface("主人早安,該起床囉!");//speak a TTS
//                mRobotAPI.motionPlay("666_TA_Yell", false);
//                Log.d("tag","handler1");
//
//            }
//        }, 1000);
//
//        handler.postDelayed(new Runnable() {
//            public void run() {
//                // yourMethod();
//                hideface();
//                Log.d("tag","handler2");
//            }
//        }, 7000);
//
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Log.d("tag","handler3.1");
//                crossBtn.setVisibility(View.VISIBLE);
//                playBtn.setVisibility(View.VISIBLE);
//                stopBtn.setVisibility(View.VISIBLE);
//                //videoPage.setVisibility(View.VISIBLE);
//                videoView.setVisibility(View.VISIBLE);
//                Log.d("tag","handler3.2");
//            }
//        },3000);
//
//    }
        //園藝操作
        LinearLayout myLayout1 = findViewById(R.id.contextLayout1);
        ImageButton imageButton1 = findViewById(R.id.imageButton1);
        Button button1 = findViewById(R.id.button1);

        View.OnClickListener clickListener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to handle the click event for both button and layout
                if (v == button1||v==myLayout1||v==imageButton1) {
                    // 頁面跳轉
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, MainActivity2.class);
                    intent.putExtra("videoResId", R.raw.my_video);
                    startActivity(intent);
                }
//
            }
        };

        myLayout1.setOnClickListener(clickListener1);
        imageButton1.setOnClickListener(clickListener1);
        button1.setOnClickListener(clickListener1);

        //蔬果種植
        LinearLayout myLayout2 = findViewById(R.id.contextLayout2);
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        Button button2 = findViewById(R.id.button2);

        View.OnClickListener clickListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to handle the click event for both button and layout
                if (v == button2||v==myLayout2||v==imageButton2) {
                    // 頁面跳轉
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, MainActivity2.class);
                    intent.putExtra("videoResId", R.raw.my_video2);
                    startActivity(intent);
                }
            }
        };

        myLayout2.setOnClickListener(clickListener2);
        imageButton2.setOnClickListener(clickListener2);
        button2.setOnClickListener(clickListener2);





//    private void showface(String tts) {
//        if (mRobotAPI != null) {
//            mRobotAPI.UnityFaceManager().showUnity();//launch face
//            mRobotAPI.startTTS(tts);//speak a TTS
//            mouthOn(200);//starting mouth on animation
//        } else {
//            Log.d(TAG, " === mNuwaRobotAPI null ===  please init");
//        }
//    }
//
//    private void hideface() {
//        if (mRobotAPI != null) {
//            mRobotAPI.UnityFaceManager().hideUnity();//hide face
//            mouthOff();
//        } else {
//            Log.d(TAG, " === mNuwaRobotAPI null ===  please init");
//        }
//    }
//
//    private void mouthOn(long speed) {
//        if (mRobotAPI != null) {
//            mRobotAPI.UnityFaceManager().mouthOn(speed);
//        } else {
//            Log.d(TAG, " === mNuwaRobotAPI null ===  please init");
//        }
//    }
//
//    private void mouthOff() {
//        if (mRobotAPI != null) {
//            mRobotAPI.UnityFaceManager().mouthOff();
//        } else {
//            Log.d(TAG, " === mNuwaRobotAPI null ===  please init");
//        }
    }

//    private class mclick implements View.OnClickListener {
//        @Override
//        public void onClick(View view) {
//            String uri = "android.resource://" + getPackageName() + "/" + R.raw.my_video;
//            videoView.setVideoURI(Uri.parse(uri));
//            mediaController.setMediaPlayer(videoView);
//            videoView.setMediaController(mediaController);
//            if(view==playBtn){
//                videoView.start();
//            }else if(view==stopBtn){
//                videoView.stopPlayback();
//            }
//        }
//    }
}