package com.example.myapplication2;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
Button next;
Intent nxt;
EditText phone;
public static final String pho="phone";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phone=(EditText) findViewById(R.id.);
        final String[] text = new String[15];
        next=findViewById(R.id.nt);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
    text[0] =phone.getText().toString();
    nxt.putExtra(pho,text);
                nxt=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(nxt);
            }
        }
    ); }}