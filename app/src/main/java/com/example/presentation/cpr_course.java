package com.example.presentation;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.airbnb.lottie.LottieAnimationView;

import java.io.IOException;

public class cpr_course extends AppCompatActivity {

    private Button left;
    private Button right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_intro);

        left = findViewById(R.id.go_left);
        right = findViewById(R.id.go_right);

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.course_step_1);
                right.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        right = findViewById(R.id.go_right);

                        setContentView(R.layout.course_step_1_b);
                        right.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                right = findViewById(R.id.go_right);

                                setContentView(R.layout.course_step_2);
                                right.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        right = findViewById(R.id.go_right);

                                        setContentView(R.layout.course_step_2_b);
                                        right.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                right = findViewById(R.id.go_right);

                                                setContentView(R.layout.course_step_3);
                                                right.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        right = findViewById(R.id.go_right);

                                                        setContentView(R.layout.course_step_3_b);
                                                        right.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                right = findViewById(R.id.go_right);

                                                                setContentView(R.layout.course_step_4);
                                                                right.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View view) {
                                                                        right = findViewById(R.id.go_right);

                                                                        setContentView(R.layout.course_step_5);
                                                                        right.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View view) {
                                                                                right = findViewById(R.id.go_right);

                                                                                setContentView(R.layout.course_step_6);
                                                                                right.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View view) {
                                                                                        right = findViewById(R.id.go_right);

                                                                                        setContentView(R.layout.course_step_7);
                                                                                        right.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View view) {
                                                                                                right = findViewById(R.id.go_right);

                                                                                                setContentView(R.layout.course_step_7_b);

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