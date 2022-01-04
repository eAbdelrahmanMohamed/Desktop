package com.example.food;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {





    ArrayList<Fragment> fragments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.pager);
        tabLayout=findViewById(R.id.tabs);
        fragments.add(new ListFragment() );
        fragments.add(new ListFragment() );
        fragments.add(new ListFragment() );
DemoCollectionAdapter adapter=new DemoCollectionAdapter(getSupportFragmentManager(),getApplicationContext(),fragments);

    }

    TabLayout tabLayout;
    ViewPager2 viewPager;
}