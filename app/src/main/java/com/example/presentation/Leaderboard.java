package com.example.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Leaderboard extends AppCompatActivity {
    private ImageButton libraryBtn;
    private ImageButton leaderboardBtn;
    private ImageButton homeBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leaderboard);
        homeBtn=findViewById(R.id.home);
        libraryBtn=findViewById(R.id.library);
        homeBtn.setOnClickListener(view->{
            startActivity(new Intent(Leaderboard.this, mainPage.class));
        });
        libraryBtn.setOnClickListener(view->{
            startActivity(new Intent(Leaderboard.this, Library.class));
        });
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

}
