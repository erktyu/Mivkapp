package com.example.android.miwokapp;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation){
        this.mDefaultTranslation =defaultTranslation;
        this.mMiwokTranslation =miwokTranslation;
    }

    public void setDefaultTranslation(String DefaultTranslation) {
        this.mDefaultTranslation = DefaultTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
