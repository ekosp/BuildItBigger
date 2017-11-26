package com.ekosp.customandroidlibrary;

import android.content.Context;
import android.content.Intent;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.MyClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       // Intent intent = getIntent();
      //  String joke = intent.getStringExtra("joke");
      //  Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();

      //  new EndpointsAsyncTask().execute(new Pair<Context, String>(this, MyClass.message1));
    }
}
