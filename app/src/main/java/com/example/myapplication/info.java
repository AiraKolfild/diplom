package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }
    public void slovar(View view) {
        Intent a = new Intent(this, slover.class);
        startActivity(a);
        finish();
    }

        public void home(View view) {
        Intent a = new Intent(this, menu.class);
        startActivity(a);
        finish();
    }


    public void url1 (View view) {
        url1 ( "http://svyatoslav.biz/software_testing_book/");
    }

    private void url1 (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void url2 (View view) {
        url2 ( "https://testengineer.ru/bolshoj-uchebnik-po-testirovaniyu/");
    }

    private void url2 (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void url3 (View view) {
        url3 ( "https://vk.com/doc27725415_320974082?hash=17zGrc8g1WhUKJvbZsH6vYXi9LXljYDMShAqp5xYWoz&dl=0KMtzpFatPz3vHImhF7Cg49PgLeGMrsuZaQdguJCBqX");
    }

    private void url3 (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void url4 (View view) {
        url4 ( "https://vk.com/doc123534285_437857869?hash=gCWnQ65R6AzlGj7BJzkTsHZGGoNurGK0XguD7GPP8Xg&dl=jnWDdOd90ZXL3UNqMBzuIH3mw2qy0xtFIBVcdpixJJz");
    }

    private void url4 (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    public void url5 (View view) {
        url5 ( "https://vk.com/doc47891732_447916348?hash=WfyEaMU9o7NzNMw7zv5kyjU9v5uWL3hAVDs0R7unHm0&dl=QZjWShd59YdHr1AmNGblBB0mwvqKvhn61Cj8L73fqZX");
    }

    private void url5 (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}