package com.example.food;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.example.food.ListFragment.Itemlist;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DemoCollectionAdapter extends FragmentStateAdapter {
    @NonNull
    Context context;
    ArrayList<Fragment> fragments;




    public DemoCollectionAdapter(@NonNull @NotNull FragmentManager fragmentManager, @NonNull @NotNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    public DemoCollectionAdapter(FragmentManager supportFragmentManager, Context applicationContext, ArrayList<Fragment> fragments) {
        super(supportFragmentManager, applicationContext, fragments);
    }


    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = new ListFragment();
        Bundle args = new Bundle();
        args.putInt(String.valueOf(new Itemlist()), position + 1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 100;
    }
}
