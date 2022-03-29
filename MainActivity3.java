package com.example.tests;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void goNewView(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity4.class);
        startActivity(intent);

}
    public void aaddd(View view) {
        boolean yes1=true;
        Toast.makeText(this, "ваш ответ зачтен", Toast.LENGTH_SHORT).show();

    }
    public void aaddc(View view) {
        boolean no1=true;
        Toast.makeText(this, "ваш ответ зачтен", Toast.LENGTH_SHORT).show();

    }
    public void aaddb(View view) {
        boolean vzos1=true;
        Toast.makeText(this, "ваш ответ зачтен", Toast.LENGTH_SHORT).show();

    }
    boolean yes1=true;


    }
    }


