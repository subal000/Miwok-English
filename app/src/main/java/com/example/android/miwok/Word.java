package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mimgResourceid = NO_IMAGE_PROVIDED;
    private int mAudioResource;
    private static final int NO_IMAGE_PROVIDED = -1;
    public Word(String defaultTranslation , String miwokTranslation, int AudioResource){
        mMiwokTranslation= miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResource = AudioResource;
    }
    public Word(String defaultTranslation , String miwokTranslation, int imgResourceid, int audioResource ){
        mMiwokTranslation= miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mimgResourceid= imgResourceid;
        mAudioResource=audioResource;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
            return mMiwokTranslation;
    }
    public int getimgResourceid(){
        return mimgResourceid;
    }
    public int getAudioResource(){
        return mAudioResource;
    }
    public boolean hasImage(){
        return mimgResourceid != NO_IMAGE_PROVIDED;
    }
}
