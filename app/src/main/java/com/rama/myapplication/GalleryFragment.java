package com.rama.myapplication;

// 18 Mei 2022,
// 10119181,
// Rama Ramdani
// IF5

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GalleryFragment extends Fragment {
    String title[] = {"Kiki Mulyadi", "Reza Kurnia", "Fajar Nugraha", "Fikri Akbari ", "Albee Akbar","Foto Rama"};
    int arr[] = {R.drawable.kiki, R.drawable.jakur, R.drawable.janug, R.drawable.fikri, R.drawable.albe, R.drawable.ramaprof};
    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);
        recyclerView = rootView.findViewById(R.id.list_gallery);
        layoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        Adapter_gallery adapter_gallery = new Adapter_gallery(getActivity(),title,arr);
        recyclerView.setAdapter(adapter_gallery);
        return rootView;
    }
}
