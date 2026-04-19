package com.example.myapplication;

public class krowa implements animal {

    @Override
    public String getName() {
        return "Krowa";
    }

    @Override
    public int getSoundResId() {
        return R.raw.krowa;
    }
}
