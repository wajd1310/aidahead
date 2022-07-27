package com.example.presentation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class LastPage extends AppCompatActivity {
    LottieAnimationView lottieAnimationView;
    protected void onCreate(Bundle savedInstanceState) {
        lottieAnimationView=findViewById(R.id.lottie);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last_page);
        lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(2000);

    }
}
