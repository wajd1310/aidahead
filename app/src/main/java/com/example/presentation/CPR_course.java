package com.example.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.presentation.Leaderboard;
import com.example.presentation.Library;
import com.example.presentation.R;
import com.example.presentation.mainPage;

public class CPR_course extends AppCompatActivity {
    private ImageButton leaderboardBtn;
    private ImageButton homeBtn;
    private ImageButton libraryBtn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_intro);

    }
}