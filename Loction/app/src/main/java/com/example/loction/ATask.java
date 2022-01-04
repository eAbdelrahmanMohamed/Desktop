package com.example.loction;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ATask extends AppCompatActivity {
Button d;
EditText url;
ImageView mg;
    @Override
    protected Bitmap onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task);
        d=(Button) findViewById(R.id.button3);
        url=(EditText) findViewById(R.id.t1);
        mg=(ImageView) findViewById(R.id.imageView);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
dowmload d1=new dowmload();
d1.execute(url.getText().toString());
            }
        });
        Bitmap connect (String url){
        Bitmap result=null;
        return result;
        }
        }
    }

    class dowmload extends AsyncTask<String,Void, Bitmap> {

        public dowmload(String url) {
        }

        @Override
        protected Bitmap doInBackground(String... urls) {
           Bitmap result=null;
    result= new dowmload(urls[0]);
                return result;
        }
        protected void onpreExecute(Bitmap bitmap){
super.onPostExecute(bitmap);

            Toast.makeText(ATask.this,"",Toast.LENGTH_SHORT).show();
        }}

}