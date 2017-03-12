package com.world.hello.simplenotimemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class notiup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notiup);
    }
    public void button(View v) {
        Intent intent = new Intent(getApplicationContext(), up.class);

        EditText title = (EditText) findViewById(R.id.title);

        String T = title.getText().toString();
        intent.putExtra("title", T);


        EditText neyong = (EditText) findViewById(R.id.neyong);

        String N = neyong.getText().toString();
        intent.putExtra("neyong",N);

        startActivity(intent);

    }
  }
