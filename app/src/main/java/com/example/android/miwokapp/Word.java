package com.example.android.miwokapp;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mResouce;
    private boolean isThereImage;

    public Word(String defaultTranslation, String miwokTranslation){
        this.mDefaultTranslation =defaultTranslation;
        this.mMiwokTranslation =miwokTranslation;
        this.isThereImage=false;
    }

    public Word(String defaultTranslation, String miwokTranslation, int resouce){
        this(defaultTranslation,miwokTranslation);
        this.mResouce = resouce;
        this.isThereImage=true;
    }

    public void setDefaultTranslation(String DefaultTranslation) {
        this.mDefaultTranslation = DefaultTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.mMiwokTranslation = miwokTranslation;
    }

    public boolean isThereImage() {
        return isThereImage;
    }

    //    public void setmResouce(int mResouce) {
//        this.mResouce = mResouce;
//    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmResouce() {
        return mResouce;
    }
}
