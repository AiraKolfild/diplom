package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }
    public void les1(View view) {
        Intent a = new Intent(this, les1.class);
        startActivity(a);
        finish();
    }
    public void les2(View view) {
        Intent a = new Intent(this, les2.class);
        startActivity(a);
        finish();
    }
    public void les3(View view) {
        Intent a = new Intent(this, les3.class);
        startActivity(a);
        finish();
    }
    public void les4(View view) {
        Intent a = new Intent(this, les4.class);
        startActivity(a);
        finish();
    }
    public void les5(View view) {
        Intent a = new Intent(this, les5.class);
        startActivity(a);
        finish();
    }
    public void les6(View view) {
        Intent a = new Intent(this, les6.class);
        startActivity(a);
        finish();
    }


    public void les7(View view) {
        Intent a = new Intent(this, les7.class);
        startActivity(a);
        finish();
    }
    public void les8(View view) {
        Intent a = new Intent(this, les8.class);
        startActivity(a);
        finish();
    }

    public void slovar(View view) {
        Intent a = new Intent(this, slover.class);
        startActivity(a);
        finish();
    }


    public void tests(View view) {
        Intent a = new Intent(this, menutests.class);
        startActivity(a);
        finish();
    }
}