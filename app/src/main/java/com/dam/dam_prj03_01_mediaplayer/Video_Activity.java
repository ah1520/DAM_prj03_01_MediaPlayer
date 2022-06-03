package com.dam.dam_prj03_01_mediaplayer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video_Activity extends AppCompatActivity {

    VideoView videoView_Auto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoView_Auto = (VideoView)  findViewById(R.id.videoView_Auto);

        String uriPath = ("android.resource://" + getPackageName() + "/raw/" + R.raw.mp_ts_drunk);
        Uri uri = Uri.parse(uriPath);
        videoView_Auto.setVideoURI(uri);
        videoView_Auto.start();

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView_Auto);
        videoView_Auto.setMediaController(mediaController);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("CurrentPosition", videoView_Auto.getCurrentPosition());
        videoView_Auto.pause();
    }

    @Override
    public void onRestoreInstanceState(@Nullable Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        assert savedInstanceState != null;
        int position = savedInstanceState.getInt("CurrentPosition");
        videoView_Auto.seekTo(position);
    }

}