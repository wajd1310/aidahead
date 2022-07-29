package com.example.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class Course_2_Activity extends AppCompatActivity {
    private course2lib Course=new course2lib();
    private TextView StepView;
    private TextView par1;
    private TextView par2;
    private ImageView ImageView;
    private Button button;
    private Button back_button;
    private int stepnum=0;
    private int backnum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call_emergency_step_3);
        StepView=findViewById(R.id.step);
        par1=findViewById(R.id.par1);
        par2=findViewById(R.id.par2);
        ImageView=findViewById(R.id.image);
        button=findViewById(R.id.go_right1B);
        back_button=findViewById(R.id.go_left1B);
        updatestep();
        button.setOnClickListener(view -> {
            updatestep();
        });
        back_button.setOnClickListener(view -> {
            reupdatestep();
        });
    }
    private void updatestep() {
        if (stepnum == 4) {
            Intent intent = new Intent(Course_2_Activity.this, LastPage.class);
            startActivity(intent);
        } else {
            StepView.setText(Course.getSteps(stepnum));
            /*ImageView.setImage(Course.getSteps(stepnum));*/
            Picasso.with(Course_2_Activity.this).load(Course.getImage(stepnum)).into(ImageView);
            par1.setText(Course.getParagraphs1(stepnum));
            par2.setText(Course.getParagraphs2(stepnum));
            stepnum++;
            backnum++;
        }
    }
    private void reupdatestep() {
        if (backnum == 0) {
            Intent intent = new Intent(Course_2_Activity.this, account.class);
            startActivity(intent);
        } else {
            StepView.setText(Course.getSteps(backnum-2));
            /*ImageView.setImage(Course.getSteps(stepnum));*/
            Picasso.with(Course_2_Activity.this).load(Course.getImage(backnum-2)).into(ImageView);
            par1.setText(Course.getParagraphs1(backnum-2));
            par2.setText(Course.getParagraphs2(backnum-2));
            backnum--;
            stepnum--;
        }
    }

}
