package com.example.myapplication;

public class pies implements animal {

    @Override
    public String getName() {
        return "Pies";
    }

    @Override
    public int getSoundResId() {
        return R.raw.pies;
    }
}
