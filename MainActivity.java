package com.example.ittest;

import static com.example.ittest.R.drawable.chapaev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1;
    Button button2;
    Button button3;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // находим элементы

        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);



        // прописываем обработчик
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

        // определяем нажатую кнопку и выполняем соответствующую операцию
        // в oper пишем операцию, потом будем использовать в выводе
        TextView textView4;
        TextView textView;
        TextView textView3;
        TextView textView5;
        ImageView imageView3;
        Button button4;
        Button button5;
        Button button7;

        Button button9;
        Button button10;
        Button button12;
        Button button8;
        Button button13;
        Button button15;
        Button button16;
        Button button17;




        switch (v.getId()) {
            case R.id.button1:
                per.numbertest = "1";
                setContentView(R.layout.activity_main2);
                textView4 = (TextView) findViewById(R.id.textView4);
                button9 = (Button) findViewById(R.id.button9);
                button10 = (Button) findViewById(R.id.button10);
                button12 = (Button) findViewById(R.id.button12);
                per.vopros(per.numbertest,"1");
                textView4.setText(per.vopr);
                button9.setText("Да");
                button10.setText("Нет");
                button12.setText("Назад");
                button9.setOnClickListener(this);
                button10.setOnClickListener(this);

                button12.setOnClickListener(this);
                break;
            case R.id.button2:
                per.numbertest = "2";
                setContentView(R.layout.activity_main2);
                textView4 = (TextView) findViewById(R.id.textView4);
                button9 = (Button) findViewById(R.id.button9);
                button10 = (Button) findViewById(R.id.button10);

                button12 = (Button) findViewById(R.id.button12);
                per.vopros(per.numbertest,"1");
                textView4.setText(per.vopr);
                button9.setText("Да");
                button10.setText("Нет");

                button12.setText("Назад");
                button9.setOnClickListener(this);
                button10.setOnClickListener(this);

                button12.setOnClickListener(this);
                break;
            case R.id.button3:
                per.numbertest = "3";
                setContentView(R.layout.activity_main2);
                textView4 = (TextView) findViewById(R.id.textView4);
                button9 = (Button) findViewById(R.id.button9);
                button10 = (Button) findViewById(R.id.button10);

                button12 = (Button) findViewById(R.id.button12);
                per.vopros(per.numbertest,"1");
                textView4.setText(per.vopr);
                button9.setText("Да");
                button10.setText("Нет");

                button12.setText("Назад");
                button9.setOnClickListener(this);
                button10.setOnClickListener(this);

                button12.setOnClickListener(this);
                break;
            case R.id.button9:
                per.ansver1 = "1";
                setContentView(R.layout.activity_main3);
                textView = (TextView) findViewById(R.id.textView);
                button4 = (Button) findViewById(R.id.button4);
                button5 = (Button) findViewById(R.id.button5);

                button7 = (Button) findViewById(R.id.button7);
                per.vopros(per.numbertest,"2");
                textView.setText(per.vopr);
                button4.setText("Да");
                button5.setText("Нет");

                button4.setOnClickListener(this);
                button5.setOnClickListener(this);

                button7.setOnClickListener(this);
                break;
            case R.id.button10:
                per.ansver1 = "2";
                setContentView(R.layout.activity_main3);
                textView = (TextView) findViewById(R.id.textView);
                button4 = (Button) findViewById(R.id.button4);
                button5 = (Button) findViewById(R.id.button5);

                button7 = (Button) findViewById(R.id.button7);
                per.vopros(per.numbertest,"2");
                textView.setText(per.vopr);
                button4.setText("Да");
                button5.setText("Нет");

                button4.setOnClickListener(this);
                button5.setOnClickListener(this);

                button7.setOnClickListener(this);
                break;


            case R.id.button12:
               finishActivity(2);
                setContentView(R.layout.activity_main);
                // находим элементы

                button = (Button) findViewById(R.id.button);
                button1 = (Button) findViewById(R.id.button1);
                button2 = (Button) findViewById(R.id.button2);
                button3 = (Button) findViewById(R.id.button3);
                // прописываем обработчик
                button1.setOnClickListener(this);
                button2.setOnClickListener(this);
                button3.setOnClickListener(this);
                button.setOnClickListener(this);
                break;
            case R.id.button:

               finish();

                break;
            case R.id.button4:
                per.ansver2 = "1";
                setContentView(R.layout.activity_main4);
                textView3 = (TextView) findViewById(R.id.textView3);
                button8 = (Button) findViewById(R.id.button8);
                button13 = (Button) findViewById(R.id.button13);
                button15 = (Button) findViewById(R.id.button15);
                per.vopros(per.numbertest,"3");
                textView3.setText(per.vopr);
                button8.setText("Да");
                button13.setText("Нет");
                button15.setText("Назад");
                button8.setOnClickListener(this);
                button13.setOnClickListener(this);

                button15.setOnClickListener(this);
                break;
            case R.id.button5:
                per.ansver2 = "2";
                setContentView(R.layout.activity_main4);
                textView3 = (TextView) findViewById(R.id.textView3);
                button8 = (Button) findViewById(R.id.button8);
                button13 = (Button) findViewById(R.id.button13);

                button15 = (Button) findViewById(R.id.button15);
                per.vopros(per.numbertest,"3");
                textView3.setText(per.vopr);
                button8.setText("Да");
                button13.setText("Нет");
                button15.setText("Назад");
                button8.setOnClickListener(this);
                button13.setOnClickListener(this);

                button15.setOnClickListener(this);
                break;


            case R.id.button7:
                finishActivity(3);
               /* intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);*/
                setContentView(R.layout.activity_main2);
                textView4 = (TextView) findViewById(R.id.textView4);
                button9 = (Button) findViewById(R.id.button9);
                button10 = (Button) findViewById(R.id.button10);

                button12 = (Button) findViewById(R.id.button12);
                per.vopros(per.numbertest,"1");
                textView4.setText(per.vopr);
                button9.setText("Да");
                button10.setText("Нет");

                button12.setText("Назад");
                button9.setOnClickListener(this);
                button10.setOnClickListener(this);

                button12.setOnClickListener(this);

                break;
            case R.id.button8:
                per.ansver3 = "1";
                setContentView(R.layout.activity_main5);
                textView5 = (TextView) findViewById(R.id.textView5);
                imageView3 =(ImageView) findViewById(R.id.imageView3);
                button16 = (Button) findViewById(R.id.button16);
                button17 = (Button) findViewById(R.id.button17);
                per.my1(per.numbertest,per.ansver1,per.ansver2,per.ansver3);
                textView5.setText(per.textout);

                imageView3.setImageResource(per.imout);
                button16.setOnClickListener(this);
                button17.setOnClickListener(this);
                /*imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);*/

                break;
            case R.id.button13:
                per.ansver3 = "2";
                setContentView(R.layout.activity_main5);
                textView5 = (TextView) findViewById(R.id.textView5);
                imageView3 =(ImageView) findViewById(R.id.imageView3);
                button16 = (Button) findViewById(R.id.button16);
                button17 = (Button) findViewById(R.id.button17);
                per.my1(per.numbertest,per.ansver1,per.ansver2,per.ansver3);
                textView5.setText(per.textout);

                imageView3.setImageResource(per.imout);
                button16.setOnClickListener(this);
                button17.setOnClickListener(this);
                /*imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);*/

                break;

            case R.id.button15:
                finishActivity(4);
                setContentView(R.layout.activity_main3);
                textView = (TextView) findViewById(R.id.textView);
                button4 = (Button) findViewById(R.id.button4);
                button5 = (Button) findViewById(R.id.button5);

                button7 = (Button) findViewById(R.id.button7);
                per.vopros(per.numbertest,"2");
                textView.setText(per.vopr);
                button4.setText("Да");
                button5.setText("Нет");

                button4.setOnClickListener(this);
                button5.setOnClickListener(this);

                button7.setOnClickListener(this);

                break;
            case R.id.button16:
                finish();
            case R.id.button17:
                finishActivity(5);
                finishActivity(4);
                finishActivity(3);
                finishActivity(2);

                setContentView(R.layout.activity_main);
                // находим элементы

                button = (Button) findViewById(R.id.button);
                button1 = (Button) findViewById(R.id.button1);
                button2 = (Button) findViewById(R.id.button2);
                button3 = (Button) findViewById(R.id.button3);



                // прописываем обработчик
                button1.setOnClickListener(this);
                button2.setOnClickListener(this);
                button3.setOnClickListener(this);
                button.setOnClickListener(this);


                break;
            default:
                break;
        }



    }
}