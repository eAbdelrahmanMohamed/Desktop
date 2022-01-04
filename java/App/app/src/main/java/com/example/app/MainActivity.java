package com.example.app;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
Button button;
Button button2;
TextView textView;
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.change);
        textView=findViewById(R.id.changetext);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("hello from chaned text");

            }
        });
button2=findViewById(R.id.next);
button2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        intent=new Intent(MainActivity.this,MainActivity2.class);
      String t = textView.getText().toString();
        intent.putExtra("text",t);
        startActivity(intent);
    }
});
    }
}