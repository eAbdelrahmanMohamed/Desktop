package com.example.joaan;

import android.os.Build;
import android.view.View;
import android.widget.Toolbar;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentViewHolder;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ViewPager2 viewPager;
TabLayout tabLayout ;
TabLayoutMediator layoutMediator;
ArrayList<ViewPager2> fragments;
Toolbar toolbar;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

tabLayout= findViewById(R.id.tabs);
        viewPager= (ViewPager2) findViewById(R.id.pager);
        fragments.add(new nav() );
        fragments.add(new nav() );
        fragments.add(new nav() );

        tabLayout.setupWithViewPager(pagerAdapter);

    }

}