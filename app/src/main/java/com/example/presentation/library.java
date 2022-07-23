package com.example.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class library extends AppCompatActivity{
    private ImageButton leaderboardBtn;
    private ImageButton homeBtn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.library);
        leaderboardBtn=findViewById(R.id.leaderboard);
        homeBtn=findViewById(R.id.home);
        leaderboardBtn.setOnClickListener(view->{
            startActivity(new Intent(library.this, Leaderboard.class));
        });
        homeBtn.setOnClickListener(view->{
            startActivity(new Intent(library.this, mainPage.class));
        });
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

}
