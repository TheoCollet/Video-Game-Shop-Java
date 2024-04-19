package com.example.jsonausite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.jsonausite.Categorie.Categories;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void categories(View view){

        Intent i = new Intent(this, Categories.class);
        startActivity(i);
    }
    public  void series(View view){
        Intent i = new Intent(this, Series.class);
        startActivity(i);
    }
}