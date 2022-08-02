package com.example.presentation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class MiniGame extends AppCompatActivity {


    long end_time;
    int i  = 0;
    //MediaPlayer mySong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("hello");
        long end_time = 0;
        //mySong = MediaPlayer.create(MainActivity.this,R.raw.stayingAlive);


    }

    public void repeat(View view) {
        end_time = System.nanoTime();
        System.out.println("check");
    }
    public void start(View v)
    {
        //mySong.start();
        Timer t = new Timer();
        long start_time = System.nanoTime();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                double difference = (end_time - start_time) / 1e9;
                System.out.println(end_time);
                System.out.println(start_time);
                System.out.println(difference);
                if(difference<100 && difference>0){
                    System.out.println("it worked");
                    long start_time = System.nanoTime();
                    i++;
                    if(i==3){
                        System.out.println("you won");
                        t.cancel();
                    }
                }
                else{
                    System.out.println("you failed");

                }
            }
        };
        t.schedule(tt,500,1700);
    }
}