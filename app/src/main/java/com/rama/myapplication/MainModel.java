package com.rama.myapplication;

// 18 Mei 2022,
// 10119181,
// Rama Ramdani
// IF5

public class MainModel {
    Integer img_friend;
    String keterangan;

    public MainModel(Integer img_friend,String keterangan){
        this.img_friend = img_friend;
        this.keterangan = keterangan;


    }
    public Integer getImg_friend(){
        return img_friend;
    }

    public String getKeterangan() {
        return keterangan;
    }
}
