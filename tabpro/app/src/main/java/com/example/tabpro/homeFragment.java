package com.example.tabpro;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tabpro.ui.main.PageAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link homeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class homeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    View view;
    RecyclerView recyclerView;
    ArrayList<Items> arrayList;
String name[]={"pizza","burger","rice","pasta"};
int price[]={75,50,25,25};
PageAdapter.SectionsPagerAdapter adapter;

    public static homeFragment newInstance(String param1, String param2) {
        homeFragment fragment = new homeFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       view= inflater.inflate(R.layout.homefragment, container, false);
        recyclerView=(RecyclerView) view.findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        arrayList=new ArrayList<>();
        for (int i=0;i< name.length;i++){
            Items items=new Items();
            items.setProductName(name[i]);
            items.setProductPrice(price[i]);
            arrayList.add(items);

        }
        adapter=new PageAdapter.SectionsPagerAdapter(arrayList);
        recyclerView.setAdapter(adapter);

        return view;

    }

    public class Items {

        public String productName;
        public int productPrice;

        public int getProductPrice() {
            return productPrice;
        }

        public void setProductPrice(int productPrice) {
            this.productPrice = productPrice;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }
    }

}