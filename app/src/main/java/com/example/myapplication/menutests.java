package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menutests extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menutests);
    }
    public void slovar(View view) {
        Intent a = new Intent(this, slover.class);
        startActivity(a);
        finish();
    }

    public void test1(View view) {
        Intent a = new Intent(this, test1.class);
        startActivity(a);
        finish();
    }
    public void test2(View view) {
        Intent a = new Intent(this, test2.class);
        startActivity(a);
        finish();
    }
    public void test3(View view) {
        Intent a = new Intent(this, test3.class);
        startActivity(a);
        finish();
    }
    public void test4(View view) {
        Intent a = new Intent(this, test4.class);
        startActivity(a);
        finish();
    }

    public void dop(View view) {
        Intent a = new Intent(this, info.class);
        startActivity(a);
        finish();
    }
    public void home(View view) {
        Intent a = new Intent(this, menu.class);
        startActivity(a);
        finish();
    }
}