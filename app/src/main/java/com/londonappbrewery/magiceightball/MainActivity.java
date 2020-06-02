package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView title;
    private ImageView img;
    private Button askBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.titleTxt);
        img = findViewById(R.id.imgView);
        askBtn = findViewById(R.id.ask_btn);

        int[] imgArray = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5,
        };

        int[] titleArray = {
            R.string.title,
            R.string.ask_more,
            R.string.ask_one_more,
            R.string.ask_some_else
        };

        askBtn.setOnClickListener(e->{
            title.setText(titleArray[getRandomNumber(4)]);
            img.setImageResource(imgArray[getRandomNumber(5)]);
        });
    }

    private int getRandomNumber(int times){
        return new Random().nextInt(times);
    }
}
