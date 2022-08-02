package com.example.presentation;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity {
    Vibrator vibrator;
    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private String mAnswer;
    private static int mScore = 0;
    private int mQuestionNumber = 0;
    public static int getmscore(){
        return mScore;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.ques);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        updateQuestion();
        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here
                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optional
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                }else {
                    vibrator.vibrate(500);
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optional
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    vibrator.vibrate(500);
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //End of Button Listener for Button2
        //Start of Button Listener for Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here
                if (mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optional
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                }else {
                    vibrator.vibrate(500);
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //End of Button Listener for Button3
    }
    private void updateQuestion() {
        if (mQuestionNumber == 8) {
            Intent intent = new Intent(QuizActivity.this, After_Test.class);
            startActivity(intent);
            DBQuery.UpdateUserCoins(getmScore(), new MyCompleteListener() {
                @Override
                public void onSuccess() {
                    Toast.makeText(QuizActivity.this,"User registered successfully", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onFailure() {
                    Toast.makeText(QuizActivity.this,"User registered fucked", Toast.LENGTH_SHORT).show();
                }
            });
            startActivity(intent);
        } else {
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
    }
    public static int getmScore() {
        return mScore;
    }
    public static void setmscore(int num){
        mScore=num;
    }
    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }
}