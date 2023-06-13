package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class les1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_les11);
    }
    public void home(View view) {
        Intent a = new Intent(this, menu.class);
        startActivity(a);
        finish();
    }
    public void back(View view) {
        Intent a = new Intent(this, les1.class);
        startActivity(a);
        finish();
    }
}