package com.example.presentation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MiniGame extends AppCompatActivity {

    private TextView rightAnswerView;
    private TextView wrongAnswerView;
    private static int rightScor = 0;
    private static int wrongScore = 0;
boolean isFinished;
    long end_time;
    long start_time;
    int i  = 0;
    MediaPlayer mySong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_game);
        rightAnswerView = (TextView)findViewById(R.id.right);
        wrongAnswerView = (TextView)findViewById(R.id.wrong);
        System.out.println("hello");
        long end_time = 0;
        long start_time = 0;
        isFinished = false;
        mySong = MediaPlayer.create(MiniGame.this,R.raw.stay);


    }

    public void repeat(View view) {

        end_time = System.nanoTime();
        double difference = (end_time - start_time) / 1e9;
        System.out.println("check");
        System.out.println(end_time);
        System.out.println(start_time);
        System.out.println(difference);
        if(difference<8 && difference>0){
            rightScor ++;
            rightAnswerView.setText("" + rightScor);
            System.out.println("it worked");
            i++;
            if(rightScor==10){
                System.out.println("you won");
                mySong.stop();
                isFinished = true;



            }
        }
        else{
            wrongScore++;
            wrongAnswerView.setText("" + wrongScore);
            System.out.println("you failed");

        }
    }
    public void start(View v)
    {
        mySong.start();
        Timer t = new Timer();
        start_time = System.nanoTime();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                 start_time = System.nanoTime();
        if(isFinished){
            t.cancel();
            Intent intent = new Intent(MiniGame.this, QuizActivity.class);
            startActivity(intent);
        }
            }
        };
        t.schedule(tt,1700*8 - 10,1750);

    }
}