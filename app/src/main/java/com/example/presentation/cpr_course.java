package com.example.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class cpr_course extends AppCompatActivity {

    private Button left;
    private Button right , right2;
    private ImageButton accountBtn;
    private Button button_library;
    private ImageButton leaderboardBtn;
    private ImageButton homeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_intro);

        left = findViewById(R.id.go_left);
        right = findViewById(R.id.go_right1B);
        accountBtn = findViewById(R.id.account);
        button_library = findViewById(R.id.button_library);
        homeBtn = findViewById(R.id.home);
        leaderboardBtn=findViewById(R.id.leaderboard);


        leaderboardBtn = findViewById(R.id.leaderboard);
        leaderboardBtn.setOnClickListener(view -> {
            startActivity(new Intent(cpr_course.this, Leaderboard.class));
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });
        accountBtn.setOnClickListener(view -> {
            startActivity(new Intent(cpr_course.this, account.class));
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });
        homeBtn.setOnClickListener(view -> {
            startActivity(new Intent(cpr_course.this, mainPage.class));
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.course_step_1);
                right2 = findViewById(R.id.go_right1B);


                right2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        setContentView(R.layout.course_step_1_b_1);
                        right = findViewById(R.id.go_right1B);

                        right.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                setContentView(R.layout.course_step_2);
                                right = findViewById(R.id.go_right1B);

                                right.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.course_step_2_b);
                                        right = findViewById(R.id.go_right1B);

                                        right.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                setContentView(R.layout.course_step_3);
                                                right = findViewById(R.id.go_right1B);

                                                right.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        setContentView(R.layout.course_step_3_b);
                                                        right = findViewById(R.id.go_right1B);

                                                        right.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                setContentView(R.layout.course_step_4);
                                                                right = findViewById(R.id.go_right1B);

                                                                right.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View view) {
                                                                        setContentView(R.layout.course_step_5);
                                                                        right = findViewById(R.id.go_right1B);

                                                                        right.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View view) {
                                                                                setContentView(R.layout.course_step_6);
                                                                                right = findViewById(R.id.go_right1B);

                                                                                right.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View view) {
                                                                                        setContentView(R.layout.course_step_7);
                                                                                        right = findViewById(R.id.go_right1B);

                                                                                        right.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View view) {
                                                                                                setContentView(R.layout.course_step_7_b);
                                                                                                right = findViewById(R.id.go_right1B);
                                                                                                right.setOnClickListener(new View.OnClickListener() {
                                                                                                    @Override
                                                                                                    public void onClick(View view) {
                                                                                                        Intent intent = new Intent(cpr_course.this, QuizActivity.class);
                                                                                                        startActivity(intent);

                                                                                                    }

                                                                                                });
                                                                                            }
                                                                                        });
                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                    }
                                                                });
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }
}



