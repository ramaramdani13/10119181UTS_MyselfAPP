package com.rama.myapplication;

// 18 Mei 2022,
// 10119181,
// Rama Ramdani
// IF5

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MusicFragment extends Fragment {
    ListView listView;
    String mnama_video[] = {"O Aja Yakan", "Temen Palsu", "Wish You Were Here", "Hati Hati di Jalan", "Someone to Spend Time With"};
    String mtahun_video[] = {"Young Lex", "YoungLex ft. Afrogie","Neck Deep", "Tulus", "Los Retros"};
    int mimg_video[] = {R.drawable.younglex2, R.drawable.younglex1, R.drawable.neckdeep
            , R.drawable.tulus,R.drawable.losretros};

    VideoView videoView;
    //deklarasi objek
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_music, container, false);
        videoView = rootView.findViewById(R.id.videoView);
        listView = rootView.findViewById(R.id.list_view_video);
        videoView = (VideoView) rootView.findViewById(R.id.videoView);
        //inisialisasi object videoView
        videoView.setVideoURI(Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.atta));
        //digunakan untuk mengidentifikasi resource seperti lokasi video
        videoView.setMediaController(new MediaController(getActivity()));
        //menampilkan media controller video
        videoView.start();
        //memulai video

        Adapter_listview adapter_listview = new Adapter_listview(getActivity(),mnama_video, mtahun_video, mimg_video);

        listView.setAdapter(adapter_listview);

        return rootView;
    }

}