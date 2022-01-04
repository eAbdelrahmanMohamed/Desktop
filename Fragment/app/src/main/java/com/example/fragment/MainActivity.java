package com.example.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {
    EditText nm;
EditText ps;
Button nt;
String temp;
public static final  String name="name";
    public static final String pass="password";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

nm=(EditText) findViewById(R.id.nm);
ps=(EditText)findViewById(R.id.ps);
nt=(Button) findViewById(R.id.nt);
nt.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Intent i=new Intent(MainActivity.this,MainActivity2.class);
        temp=nm.getText().toString();
        i.putExtra(name,temp);
        temp=ps.getText().toString();
        i.putExtra(pass,temp);
        startActivity(i);
    }
});
    }
}