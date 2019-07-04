package com.mylib;

public class ClassicalMusic implements  Music {
    @Override
    public String getSong(){
        return "Johann Christoph - Canon in D";
    }
    public String getStyle(){
        return "classical music";
    }
}
