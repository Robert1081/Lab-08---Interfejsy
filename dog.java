package com.example.myapplication;

public class dog implements animal {

    @Override
    public String getName() {
        return "Pies";
    }

    @Override
    public int getSoundResId() {
        return R.raw.dog;
    }
}
