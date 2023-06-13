package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class les7_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_les72);
    }

    public void home(View view) {
        Intent a = new Intent(this, menu.class);
        startActivity(a);
        finish();
    }
    public void back(View view) {
        Intent a = new Intent(this, les7_1.class);
        startActivity(a);
        finish();
    }

    public void next(View view) {
        Intent a = new Intent(this, les7_3.class);
        startActivity(a);
        finish();
    }
}