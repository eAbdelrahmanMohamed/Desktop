package com.example.joaan;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class FragmentAdapter extends PagerAdapter {
    Context context;
    ArrayList<ViewPager2> fragments;
    public FragmentAdapter(@NonNull FragmentManager fm ,Context context, ArrayList<ViewPager2> fragments) {

        this.context=context;
        this.fragments=fragments;
    }

    @NonNull

    public int getCount() {
        return fragments.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }
}
