package com.example.balikoevta;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;

public class Camera extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ImageView ContactsClick = (ImageView) findViewById(R.id.Contacts);
        ContactsClick.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(".Contacts");
                        startActivity(intent);
                    }
                }
        );
        ImageView HomeClick = (ImageView) findViewById(R.id.HomeButton2);
        HomeClick.setOnClickListener(this);
        ImageView GalleryClick = (ImageView) findViewById(R.id.galleryButton2);
        GalleryClick.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(".Gallery");
                        startActivity(intent);
                    }
                }
        );

    }

    @Override
    public void onClick(View view) {
        Intent i;
        i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}