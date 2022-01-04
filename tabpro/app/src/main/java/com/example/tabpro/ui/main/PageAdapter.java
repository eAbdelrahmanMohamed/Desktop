package com.example.tabpro.ui.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tabpro.R;
import com.example.tabpro.homeFragment;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class PageAdapter  extends FragmentPagerAdapter {


    @StringRes final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2,R.string.tab_text_3};
    final Context mContext;
    ArrayList<Fragment> fragments;
    public PageAdapter(FragmentManager fm, Context mContext,ArrayList<Fragment> fragments) {
        super(fm);
        this.mContext = mContext;
        this.fragments=fragments;
    }

    public Fragment getItem(int i) {
        return fragments.get(i);
    }


    public int getCount() {
        return fragments.size();
    }
   //---------------------------------------------------------------------------------
  public static class SectionsPagerAdapter extends RecyclerView.Adapter<SectionsPagerAdapter.ViewHolder> {
        private ArrayList<homeFragment.Items> ItemList;
        PageAdapter context;
        private ViewHolder holder;
        private int position;

        public SectionsPagerAdapter(ArrayList<homeFragment.Items> ItemList) {
            this.ItemList=ItemList;
        }



       public SectionsPagerAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
            View ProductView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);

            SectionsPagerAdapter.ViewHolder vh = new SectionsPagerAdapter.ViewHolder(ProductView);
            return vh;
        }

        public void onBindViewHolder(@NonNull @NotNull SectionsPagerAdapter.ViewHolder holder, int position) {
            this.holder = holder;
            this.position = position;
            holder.name.setText(ItemList.get(position).getProductName());
            holder.price.setText(ItemList.get(position).getProductPrice());
        }






        @Override
        public int getItemCount() {
            return 3;
        }
        public class ViewHolder extends RecyclerView.ViewHolder{
            TextView name;
            TextView price;
            public ViewHolder(@NonNull @NotNull View itemView) {
                super(itemView);
                name=itemView.findViewById(R.id.idProductName);
                price=itemView.findViewById(R.id.idProductPrice);

            }
        }
    }
}


