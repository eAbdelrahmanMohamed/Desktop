package com.example.project1.ui.home;

import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private String[] mText= new String[]{"burger","pizza","fish","rise","pasta"};


    public HomeViewModel() {
        for (String s : mText = new String[]) {

        }

        mText.setvalue(mText[0]+"best selling");
    }

    public String[] getText() {
        return mText;
    }
}