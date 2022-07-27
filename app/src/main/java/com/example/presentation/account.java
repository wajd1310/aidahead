package com.example.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class account extends AppCompatActivity{
    private ImageButton leaderboardBtn;
    private ImageButton homeBtn;
    private ImageButton libraryBtn;
    private Button Quiz;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account);
        leaderboardBtn=findViewById(R.id.leaderboard);
        Quiz=findViewById(R.id.button2);
        homeBtn=findViewById(R.id.home);
        libraryBtn=findViewById(R.id.library);
        leaderboardBtn.setOnClickListener(view->{
            startActivity(new Intent(account.this, Leaderboard.class));
            overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
        });
        Quiz.setOnClickListener(view->{
            startActivity(new Intent(account.this, QuizActivity.class));
            overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
        });
        homeBtn.setOnClickListener(view->{
            startActivity(new Intent(account.this, mainPage.class));
            overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
        });
        libraryBtn.setOnClickListener(view->{
            startActivity(new Intent(account.this, Library.class));
            overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
        });

        libraryBtn.setOnClickListener(view->{
            startActivity(new Intent(account.this, Library.class));
            overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
        });
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
