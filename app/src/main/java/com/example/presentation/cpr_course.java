package com.example.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class cpr_course extends AppCompatActivity {

    private Button left;
    private Button right , right2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_intro);

        left = findViewById(R.id.go_left);
        right = findViewById(R.id.go_right1B);

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
                                                                                                        Intent intent=new Intent(cpr_course.this,QuizActivity.class);
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