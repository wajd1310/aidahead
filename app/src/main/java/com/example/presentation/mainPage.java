package com.example.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.airbnb.lottie.LottieAnimationView;

public class mainPage extends AppCompatActivity {

    private ImageButton libraryBtn;
    private ImageButton leaderboardBtn;
    private ImageButton accountBtn;
    private ImageButton homeBtn,cpr_course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page_no_course);


        ImageButton home = (ImageButton) findViewById(R.id.home);
        home.setBackgroundResource(R.drawable.home_on_icon);

        libraryBtn = findViewById(R.id.library);
        cpr_course=findViewById(R.id.cpr_course);
        libraryBtn.setOnClickListener(view->{
            startActivity(new Intent(mainPage.this, Library.class));
        });
        leaderboardBtn = findViewById(R.id.leaderboard);
        leaderboardBtn.setOnClickListener(view->{
            startActivity(new Intent(mainPage.this, Leaderboard.class));
        });
        accountBtn.setOnClickListener(view->{
            startActivity(new Intent(mainPage.this, account.class));
        });
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }
}