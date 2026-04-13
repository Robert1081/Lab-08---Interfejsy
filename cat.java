package com.example.myapplication;

public class cat implements animal {

    @Override
    public String getName() {
        return "Kot";
    }

    @Override
    public int getSoundResId() {
        return R.raw.cat;
    }
}
