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
    private Button button_library;
    private ImageButton homeBtn,cpr_course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page_no_course);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageButton home = (ImageButton) findViewById(R.id.home);
        home.setBackgroundResource(R.drawable.home_on_icon);

        accountBtn=findViewById(R.id.account);
        libraryBtn = findViewById(R.id.library);
        cpr_course=findViewById(R.id.cpr_course);
        button_library=findViewById(R.id.button_library);
        cpr_course=findViewById(R.id.cpr_course);

        libraryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mainPage.this,Library.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

            }
        });

            button_library.setOnClickListener(view -> {
                startActivity(new Intent(mainPage.this, Library.class));
            });
            cpr_course.setOnClickListener(view -> {
               startActivity(new Intent(mainPage.this, cpr_course.class));
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
           });
            leaderboardBtn = findViewById(R.id.leaderboard);
            leaderboardBtn.setOnClickListener(view -> {
                startActivity(new Intent(mainPage.this, Leaderboard.class));
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            });
            accountBtn.setOnClickListener(view -> {
                startActivity(new Intent(mainPage.this, account.class));
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            });
        }
    }