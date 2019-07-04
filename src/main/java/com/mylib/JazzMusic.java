package com.mylib;

public class JazzMusic implements Music {
    @Override
    public String getSong(){
        return "Louis Armstrong - What a wonderfull world";
    }
    public String getStyle(){
        return "jazz music";
    }
}
