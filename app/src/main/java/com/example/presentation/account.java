package com
        .example.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import androidx.appcompat.app.AppCompatActivity;

public class account extends AppCompatActivity{
    private ImageButton leaderboardBtn;
    private ImageButton homeBtn;
    private ImageButton libraryBtn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.library);
        leaderboardBtn=findViewById(R.id.leaderboard);
        homeBtn=findViewById(R.id.home);
        libraryBtn=findViewById(R.id.library);
        leaderboardBtn.setOnClickListener(view->{
            startActivity(new Intent(account.this, Leaderboard.class));
        });
        homeBtn.setOnClickListener(view->{
            startActivity(new Intent(account.this, mainPage.class));
        });
        libraryBtn.setOnClickListener(view->{
            startActivity(new Intent(account.this, Library.class));
        });
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

}
