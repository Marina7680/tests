package com.example.ittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    Button button9;
    Button button10;

    Button button12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // находим элементы

        button12 = (Button) findViewById(R.id.button12);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);




        // прописываем обработчик
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);

        button12.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

        // определяем нажатую кнопку и выполняем соответствующую операцию
        // в oper пишем операцию, потом будем использовать в выводе
    /*    TextView textView;
        Button button4;
        Button button5;
        Button button6;


        String oper2 = "";

        switch (v.getId()) {
            case R.id.button9:

                oper2="Ты добрый2?";
                setContentView(R.layout.activity_main3);
                textView = (TextView) findViewById(R.id.textView);
                button4 = (Button) findViewById(R.id.button4);
                button5 = (Button) findViewById(R.id.button5);
                button6 = (Button) findViewById(R.id.button6);
                //textView.setText(per.oper);
                button4.setText("Да");
                button5.setText("Нет");
                button6.setText("Иногда");

                break;
            case R.id.button10:

                oper2="Ты умный2?";
                setContentView(R.layout.activity_main3);
                textView = (TextView) findViewById(R.id.textView);
                button4 = (Button) findViewById(R.id.button4);
                button5 = (Button) findViewById(R.id.button5);
                button6 = (Button) findViewById(R.id.button6);
                textView.setText(per.oper);
                button4.setText("Да");
                button5.setText("Нет");
                button6.setText("Иногда");

                break;
            case R.id.button11:

                oper2="Ты сильный?";
                setContentView(R.layout.activity_main2);
                textView = (TextView) findViewById(R.id.textView4);
                button9 = (Button) findViewById(R.id.button9);
                button10 = (Button) findViewById(R.id.button10);
                button11 = (Button) findViewById(R.id.button11);
                textView.setText(per.oper);
                button9.setText("Да");
                button10.setText("Нет");
                button11.setText("Иногда");

                break;
            case R.id.button:

                finish();

                break;
            default:
                break;
        }

        // формируем строку вывода

*/
        finish();
    }

}