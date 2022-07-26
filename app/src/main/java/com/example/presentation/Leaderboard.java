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

        ImageButton home = (ImageButton) findViewById(R.id.leaderboard);
        home.setBackgroundResource(R.drawable.leaderboard_on);

        homeBtn=findViewById(R.id.home);
        libraryBtn=findViewById(R.id.library);
        leaderboardBtn=findViewById(R.id.leaderboard);
        homeBtn.setOnClickListener(view->{
            startActivity(new Intent(Leaderboard.this, mainPage.class));
        });
        libraryBtn.setOnClickListener(view->{
            startActivity(new Intent(Leaderboard.this, Library.class));
        });
        leaderboardBtn.setOnClickListener(view->{
            startActivity(new Intent(Leaderboard.this, Leaderboard.class));
        });
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

}
