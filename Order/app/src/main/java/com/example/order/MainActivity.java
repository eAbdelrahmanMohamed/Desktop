package com.example.order;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.order.R.id.orderprice;
import static com.example.order.order.*;

public class MainActivity extends AppCompatActivity {
Button add,remove;
        TextView name,price,mount;
        int m;

       order pizza,burger,rice,pasta;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       name=findViewById(R.id.ordername);

       price=findViewById(orderprice);
       mount=findViewById(R.id.mount);
        m= Integer.parseInt(mount.getText().toString());
        remove=findViewById(R.id.remove);
       add=findViewById(R.id.add2);


       add.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               m++ ;
           }
       });
       remove.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               m--;
           }
       });

    }
}