package com.example.survation;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;

import java.io.*;

public class MainActivity extends AppCompatActivity {

    TextView header;
    RadioGroup radioGroup;
    RadioButton yes;
    RadioButton radioButton2;
    Button next;
    Button pre;
    Button test;
    TextView testtxt;
    item item1 ;
    Intent intent;

    FileOutputStream fos;
    DataOutputStream dos;
FileInputStream fis;
DataInputStream dis;
public String intenttag="tag";
String tag="radiogroup";
public static final String fname="Survay";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=findViewById(R.id.radiogroup);
        pre=findViewById(R.id.prebutton);
        header=findViewById(R.id.header);
       yes = findViewById(R.id.option1);
       radioButton2=findViewById(R.id.optoin2);
       radioButton2.setText("No");
        next=findViewById(R.id.nextbutton);
       header.setText("Q1 : does it works ?");
test=findViewById(R.id.fileinput);
testtxt=findViewById(R.id.test);
test.setOnClickListener(new OnClickListener() {
    @Override
    public void onClick(View v) {

        try {
            fis=openFileInput(MainActivity.fname);
            dis=new DataInputStream(fis);
            testtxt.setText(dis.readUTF());
         //   dis.close();
            //fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }});

        yes.setText("yes");

       next.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                intent=new Intent(MainActivity.this,page2.class);
               intent.putExtra(intenttag,fname);
                startActivity(intent);
            }

        });
    radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId){
                case R.id.option1:

                    try {
                        fos=openFileOutput(fname,MODE_PRIVATE);
                       // dos=new DataOutputStream(fos);
                        dos.write(Integer.parseInt(header.getText().toString()+" "+"yes"));
                    //dos.close();
                    //fos.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                case R.id.optoin2:
                    try {
                        fos=openFileOutput(fname,MODE_PRIVATE);
                        fos.write(header.getText().toString().getBytes());
                        //dos=new DataOutputStream(fos);
                        //dos.write(header.getText().toString().getBytes()+" "+"No"));
                       // dos.close();
                        fos.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + checkedId);
            }
        }
    });
    }}


