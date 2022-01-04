package com.example.food;

import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;


public class ListFragment extends Fragment {
    RecyclerView recyclerView;
    ViewPager2 viewPager2;
    ArrayList<Itemlist> listFragments;
    String name[]={"pizza","burger","rice","pasta"};
    int price[]={75,50,25,25};
    CustomAdapter adapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_list, container, false);
        TabLayout tabLayout=view.findViewById(R.id.tabs);
        new TabLayoutMediator(tabLayout,viewPager2, (tab, position) -> tab.setText("OBJECT " + (position + 1))).attach();
        DemoCollectionAdapter collectionAdapter=new DemoCollectionAdapter(this);
       viewPager2=view.findViewById(R.id.pager);
       viewPager2.setAdapter(collectionAdapter);
        recyclerView=(RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
          listFragments=new ArrayList<>();
        for (int i=0;i<listFragments.size();i++){
         Itemlist itemlist=new Itemlist();
            itemlist.setPrice(price[i]);
            itemlist.setName(name[i]);
            listFragments.add(itemlist);
        }
        adapter =new CustomAdapter(listFragments);
        recyclerView.setAdapter(adapter);
        return view;}



 public static class Itemlist {

     int price;
     String name;

     public int getPrice() {
         return price;
     }

     public  void setPrice(int Price) {

         this.price = Price;
     }

     public String getName() {
         return name;
     }

     public  void setName(String name) {
         this.name = name;
     }

 }

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.viewHolder>{

    ArrayList<Itemlist> item_list;

    public CustomAdapter(ArrayList<Itemlist> itemlists) {
        this.item_list= itemlists;
    }

    @Override
    public  viewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_list, viewGroup, false);
        return new viewHolder(view);
    }
    @Override
    public  void onBindViewHolder(viewHolder viewHolder, int position) {
        viewHolder.name.setText(item_list.get(position).getName());
        viewHolder.price.setText(item_list.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return item_list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView price;

        public viewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            price = (TextView) itemView.findViewById(R.id.price);

        }
    }
}}