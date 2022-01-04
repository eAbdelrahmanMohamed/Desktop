package com.example.claculater;

import android.os.Bundle;
import android.text.method.NumberKeyListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
     NumberKeyListener keyListener;
    Button plus;
    TextView result;
    Button minus;
    Button multibly;
    Button divide;
    String s1,s2;
    int c,d=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        multibly=findViewById(R.id.Multiply);
        divide=findViewById(R.id.Divide);
        result=findViewById(R.id.result);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                para(c,d);
                int re=c+d;
                result.setText(re);
            }
        });



    }
    public void para(int a,int b){
        this.c=a;
        this.d=b;
        s1=num1.getText().toString();
        s2=num2.getText().toString();
        c=Integer.parseInt(s1);
        d=Integer.parseInt(s2);

    }
}