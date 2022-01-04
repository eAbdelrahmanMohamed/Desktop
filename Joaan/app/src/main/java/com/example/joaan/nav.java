package com.example.joaan;

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

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link nav#newInstance} factory method to
 * create an instance of this fragment.
 */
public class nav extends Fragment {
RecyclerView recyclerView;
ArrayList<Itemlist> itemlists;
Itemlist il=new Itemlist();
String name[]={"pizza","burger","rice","pasta"};
int price[]={75,50,25,25};
CustomAdapter adapter;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public nav() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment nav.
     */
    // TODO: Rename and change types and number of parameters
    public static nav newInstance(String param1, String param2) {
        nav fragment = new nav();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_nav, container, false);
recyclerView=(RecyclerView) view.findViewById(R.id.recyclerview);
recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
recyclerView.setItemAnimator(new DefaultItemAnimator());
itemlists=new ArrayList<>();
for (int i=0;i<itemlists.size();i++){
    il.setName(name[i]);
    il.setPrice(price[i]);
itemlists.add(il);
}
adapter =new CustomAdapter(itemlists);
recyclerView.setAdapter(adapter);
return view ;   }

      class Itemlist{

        int price;
        String name;

        public int getPrice() {
            return price;
        }

        public void setPrice(int Price) {

            this.price= Price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public class CustomAdapter extends  RecyclerView.Adapter<CustomAdapter.viewHolder>{

        ArrayList<Itemlist> item_list;

        public CustomAdapter(ArrayList<Itemlist> itemlists) {
            this.item_list= itemlists;
        }

        @Override
        public  viewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_itemlist, viewGroup, false);
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
    }
}