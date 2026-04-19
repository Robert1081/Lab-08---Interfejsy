package com.example.myapplication;

public class kot implements animal {

    @Override
    public String getName() {
        return "Kot";
    }

    @Override
    public int getSoundResId() {
        return R.raw.kot;
    }
}
