package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
String name[]=new String[]{"pizza","burger","rice","pasta"};
int price[]=new int[]{87,89,66,757};
    RecyclerView recyclerView;
    adapter adapter;
    ArrayList<list> fragments=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView) findViewById(R.id.recycler_view);
        for (int i=0;i<fragments.size();i++){
            list l1=new list();
            l1.setName(name[i]);
            l1.setPrice(price[i]);
            fragments.add(l1);
        }
        fragments.add(new list() );
        adapter= new adapter(fragments);

        recyclerView.setAdapter(adapter);
    }
}