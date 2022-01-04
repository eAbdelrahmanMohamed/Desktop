package com.example.itccardview;




import android.os.Bundle;


        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;


        import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private GroceryProductAdapter mAdapter;
    private List<Grocery> mProductList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting the recyclerview from xml
        mRecyclerView = (RecyclerView) findViewById(R.id.idRecyclerView);
        //mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Populate the products
        mProductList=new ArrayList<>();
        mProductList.add(new Grocery("Mango","Rs. 150"));
        mProductList.add(new Grocery("Pineapple","Rs. 250"));

        //set adapter to recyclerview
        mAdapter = new GroceryProductAdapter(mProductList,this);
        mRecyclerView.setAdapter(mAdapter);
    }
}