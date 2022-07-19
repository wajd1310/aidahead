package com.example.presentation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class introduction extends AppCompatActivity {
 ImageView logo,splash;
    private static final int NUM=3;
    private ViewPager viewPager;
    private introduction.ScreenSlidePagerAdapter pagerAdapter;
 LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_introduction);
        logo=findViewById(R.id.logo);
        splash=findViewById(R.id.img);
        lottieAnimationView=findViewById(R.id.lottie);
        splash.animate().translationY(-2600).setDuration(1000).setStartDelay(2000);
        logo.animate().translationY(1400).setDuration(1000).setStartDelay(2000);
        lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(2000).withEndAction(new Runnable() {
            @Override
            public void run() {
                viewPager=findViewById(R.id.viewpager);
                pagerAdapter=new introduction.ScreenSlidePagerAdapter(getSupportFragmentManager());
                viewPager.setAdapter(pagerAdapter);
            }
        });

    }
    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    OnBoardingFragment1 tab1=new OnBoardingFragment1();
                    return tab1;
                case 2:
                    OnBoardingFragment2 tab2=new OnBoardingFragment2();
                    return tab2;
                case 1:
                    OnBoardingFragment3 tab3=new OnBoardingFragment3();
                    return tab3;
            }
            return null;
        }

        @Override
        public int getCount() {
            return NUM;
        }
    }
}