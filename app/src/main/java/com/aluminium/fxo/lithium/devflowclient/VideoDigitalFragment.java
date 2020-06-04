package com.aluminium.fxo.lithium.devflowclient;

import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.fragment.app.Fragment;

//фрагмент, подгружающий видео курса с моего сервера

public class VideoDigitalFragment extends Fragment {

    private VideoView videoView;
    String video_url = "http://aafb15269a11.ngrok.io/files/История_советских_компьютеров.mp4";
    ProgressDialog pd;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_video_digital, container, false);
        videoView = (VideoView) view.findViewById(R.id.digitalVideoView);
        pd = new ProgressDialog(getActivity());
        pd.setMessage("Загрузка видео. Пожалуйста, подождите...");
        pd.show();
        Uri uri = Uri.parse(video_url);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(getActivity());
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                pd.dismiss();
            }
        });


        return view;
    }

}