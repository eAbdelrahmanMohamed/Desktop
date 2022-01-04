package com.example.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.fragment.classes.phonemassege;

public class MainActivity2 extends AppCompatActivity {
Button writepref;
Button readpref;
Button writesql;
Button readsql;
SharedPreferences pref;
EditText name2;
EditText pass2;
Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name2=(EditText) findViewById(R.id.name);
        pass2=(EditText) findViewById(R.id.pass);
       name2.setText(in.getStringExtra(MainActivity.name));
pass2.setText(in.getStringExtra(MainActivity.pass));
        writepref=(Button) findViewById(R.id.wpref);
        writesql=findViewById(R.id.ws);
        writesql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
adapter2 adapter2=new adapter2(MainActivity2.this);
adapter2.addentry(new phonemassege2(getText().toString()));
adapter2.addentry(new phonemassege2(getText().toString()));
            }
        });
        readsql=findViewById(R.id.rs);
        readsql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        /*writepref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               pref=getPreferences(Context.MODE_PRIVATE);
               SharedPreferences.Editor edit= pref.edit();
               edit.putString(MainActivity.name,name2.getText().toString());
                edit.putString(MainActivity.pass,pass2.getText().toString());
edit.commit();
name2.setText("");
pass2.setText("");

            }
        });
        readpref=findViewById(R.id.readpref);
readpref.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        pref=getPreferences(Context.MODE_PRIVATE);
name2.setText(pref.getString(MainActivity.name,"N/a"));
        pass2.setText(pref.getString(MainActivity.pass,"N/a"));

    }
});*/
    }
}