package com.example.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.airbnb.lottie.LottieAnimationView;

public class mainPage extends AppCompatActivity {

    private ImageButton libraryBtn;
    private ImageButton leaderboardBtn;
    private ImageButton homeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page_no_course);
        libraryBtn = findViewById(R.id.library);
        libraryBtn.setOnClickListener(Lib);

        leaderboardBtn = findViewById(R.id.leaderboard);
        leaderboardBtn.setOnClickListener(leaderboard);

    }

    View.OnClickListener Lib = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            setContentView(R.layout.library);
            leaderboardBtn = findViewById(R.id.leaderboard);

            homeBtn = findViewById(R.id.home);
            homeBtn.setOnClickListener(home);
            leaderboardBtn = findViewById(R.id.leaderboard);
            leaderboardBtn.setOnClickListener(leaderboard);

        }
    };

    View.OnClickListener home = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            setContentView(R.layout.home_page_no_course);
            libraryBtn = findViewById(R.id.library);
            leaderboardBtn = findViewById(R.id.leaderboard);

            libraryBtn.setOnClickListener(Lib);
            leaderboardBtn = findViewById(R.id.leaderboard);
            leaderboardBtn.setOnClickListener(leaderboard);
        }
    };

    View.OnClickListener leaderboard = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            setContentView(R.layout.leaderboard);
            homeBtn = findViewById(R.id.home);
            libraryBtn = findViewById(R.id.library);


            homeBtn.setOnClickListener(home);
            libraryBtn.setOnClickListener(Lib);
            leaderboardBtn = findViewById(R.id.leaderboard);
            leaderboardBtn.setOnClickListener(leaderboard);

        }
    };
}