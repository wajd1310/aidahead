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
    private ImageButton accountBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leaderboard);

        ImageButton home = (ImageButton) findViewById(R.id.leaderboard);
        home.setBackgroundResource(R.drawable.leaderboard_on);

        homeBtn=findViewById(R.id.home);
        libraryBtn=findViewById(R.id.library);
        accountBtn=findViewById(R.id.account);
        leaderboardBtn=findViewById(R.id.leaderboard);
        homeBtn.setOnClickListener(view->{
            startActivity(new Intent(Leaderboard.this, mainPage.class));
            overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
        });
        libraryBtn.setOnClickListener(view->{
            startActivity(new Intent(Leaderboard.this, Library.class));
            overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
        });
        accountBtn.setOnClickListener(view->{
            startActivity(new Intent(Leaderboard.this, account.class));
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
        });
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

}
