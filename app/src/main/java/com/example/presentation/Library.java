package com
        .example.presentation;

import static android.widget.Toast.makeText;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class Library extends AppCompatActivity{
    private ImageButton leaderboardBtn;
    private ImageButton homeBtn;
    private ImageButton accountBtn;
    private ImageButton libraryBtn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.library);

        ImageButton home = (ImageButton) findViewById(R.id.library);
        home.setBackgroundResource(R.drawable.library_on);

        leaderboardBtn=findViewById(R.id.leaderboard);
        homeBtn=findViewById(R.id.home);
        accountBtn=findViewById(R.id.account);
        libraryBtn=findViewById(R.id.library);

        leaderboardBtn.setOnClickListener(view->{
            startActivity(new Intent(Library.this, Leaderboard.class));
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
        });
        homeBtn.setOnClickListener(view->{
            startActivity(new Intent(Library.this, mainPage.class));
            overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
        });

        accountBtn.setOnClickListener(view->{
            startActivity(new Intent(Library.this, account.class));
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
        });
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }


    private String course_name = "";
    public void onButtonShowPopupWindowClick(View view) {





        String course = "";
        switch (view.getId()) {
            case R.id.cpr:
                // do something
                break;
            case R.id.heart_attac:
                // do something else
                break;
        }


        switch (view.getId()){
            case R.id.cpr_game:
                course_name = "CPR";
                break;
            case R.id.heart_attack_game:
                course_name = "Heart Attack";
                break;
            case R.id.asthma_game:
                course_name = "Asthma";
                break;
            case R.id.chocking_game:
                course_name = "Chocking";
                break;
            case R.id.epileptic_game:
                course_name = "Epileptic";
                break;

            case R.id.burn_game:
                course_name = "Burns";
                break;

            default:
                course_name = "ERROR";
                break;
        }


        // inflate the layout of the popup window
        LayoutInflater inflater = (LayoutInflater)
                getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.popupcourse, null);

        TextView text = (TextView) popupView.findViewById(R.id.course_name);
        text.setText(course_name);

        // create the popup window
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, true);



        // show the popup window
        // which view you pass in doesn't matter, it is only used for the window tolken
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

        ImageButton go_course = (ImageButton) popupView.findViewById(R.id.buy);
        go_course.setOnClickListener(new_view ->{
            makeText(Library.this, "succ", Toast.LENGTH_SHORT).show();

            startActivity(new Intent(Library.this, cpr_course.class));

        });
    }
}
