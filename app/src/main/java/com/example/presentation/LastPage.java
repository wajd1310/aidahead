package com.example.presentation;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;


public class LastPage extends AppCompatActivity {
    LottieAnimationView lottieAnimationView;
    private int score;
    private TextView result;
    protected void onCreate(Bundle savedInstanceState) {
        lottieAnimationView=findViewById(R.id.lottie);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last_page);
        lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(2000);
        score = QuizActivity.getmScore();
        result = findViewById(R.id.result);
        String new_score = String.valueOf(score);
        result.setText(new_score);
    }
}
