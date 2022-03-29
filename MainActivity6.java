package com.example.tests;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    public void goNewView(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity7.class);
        startActivity(intent);
    }
}