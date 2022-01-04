package com.example.survation;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.io.*;

public class page2 extends AppCompatActivity {
    FileOutputStream fos;
    DataOutputStream dos;
    FileInputStream fis;
    DataInputStream dis;
    Button test;
    TextView testtxt;
    TextView header;
    RadioGroup radioGroup;
    RadioButton male;
    RadioButton fmale;
    Button next;
    Button pre;
Intent intent2;
    public static final String fname="Survay";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        header=findViewById(R.id.header);
        header.setText("Q2: What is your Gender ?");
        male=findViewById(R.id.option1);
        male.setText("Male");
        fmale=findViewById(R.id.optoin2);
        fmale.setText("Female");

        next=findViewById(R.id.nextbutton);
        radioGroup=findViewById(R.id.radiogroup);
        test=findViewById(R.id.fileinput);
        pre=findViewById(R.id.prebutton);
        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               intent2=new Intent(page2.this,MainActivity.class);
               startActivity(intent2);
            }
        });
        testtxt=findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
intent2.getExtras(MainActivity.fname);
              /*  try {
                    fis=openFileInput(MainActivity.fname);
                   dis=new DataInputStream(fis);
                    testtxt.setText(dis.read());
                    dis.close();
                    fis.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }*/


            }});
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.option1:

                        try {
                            fos=openFileOutput(fname,MODE_PRIVATE);
                            dos=new DataOutputStream(fos);
                            dos.write(Integer.parseInt(header.getText().toString()+" "+"male"));
                            dos.close();
                            fos.close();
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        break;
                    case R.id.optoin2:
                        try {
                            fos=openFileOutput(fname,MODE_PRIVATE);
                           // dos=new DataOutputStream(fos);
                            dos.write(Integer.parseInt(header.getText().toString()+" "+"female"));
                            dos.close();
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
    }
}