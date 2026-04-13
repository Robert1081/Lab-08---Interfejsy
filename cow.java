package com.example.myapplication;

public class cow implements animal {

    @Override
    public String getName() {
        return "Krowa";
    }

    @Override
    public int getSoundResId() {
        return R.raw.cow;
    }
}
