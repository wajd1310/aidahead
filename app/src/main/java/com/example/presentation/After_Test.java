package com.example.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class After_Test extends AppCompatActivity {
    private TextView Score;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after_course_page);
        Score=findViewById(R.id.Score);
        button=findViewById(R.id.continue_b);
        Score.setText(QuizActivity.getmScore()+"/8");
        button.setOnClickListener(view -> {
            startActivity(new Intent(After_Test.this, mainPage.class));
        });
    }
}