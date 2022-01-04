package com.example.survation;

import android.widget.RadioButton;

public class item {
    int counter=1;
    RadioButton rb;
    String txt="";
float presantage=(counter/2)*100;
    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
