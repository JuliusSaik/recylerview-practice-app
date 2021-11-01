package com.saikauskas.julius.recyclerviewpractice;

public class Item {

    private int mImgResource;
    private String mText1, mText2;

    public Item(int imgResource, String text1, String text2){
        mImgResource = imgResource;
        mText1 = text1;
        mText2 = text2;
    }


    public int getmImgResource() {
        return mImgResource;
    }

    public String getmText1() {
        return mText1;
    }

    public String getmText2() {
        return mText2;
    }
}
