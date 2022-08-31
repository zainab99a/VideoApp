package com.zainabali.yz.videoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
Button button1;
Button button2;
Button video;
VideoView viewVideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.Play);
       // video=findViewById(R.id.video);
       // viewVideo=findViewById(R.id.videoView);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.assala_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
mediaPlayer.start();

            }
        });
// to stop the song
        button2=findViewById(R.id.pause);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();

            }
        });









      //  video.setOnClickListener(new View.OnClickListener() {
          //  @Override
          //  public void onClick(View view) {
              //  MediaController mediaController = new MediaController(MainActivity.this);
             //   viewVideo.setMediaController(mediaController);
              //  String path= "android.resource://" +getPackageName()+ "/"+R.raw.simpsons;
              //  Uri u=Uri.parse(path);
            //    viewVideo.setVideoURI(u);
             //   viewVideo.start();


           // }
        //});
    }
}