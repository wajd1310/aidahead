package com.example.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.WindowManager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActiv extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    FloatingActionButton fb,google,instagram;
    float v=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        tabLayout=findViewById(R.id.tablelayout);
        viewPager=findViewById(R.id.viewpager);
        google=findViewById(R.id.googleID);
        fb=findViewById(R.id.facebook);
        instagram=findViewById(R.id.insta);
        tabLayout.addTab(tabLayout.newTab().setText("Login"));
        tabLayout.setTabGravity (TabLayout.GRAVITY_FILL);
        final LoginAdapter adapter = new LoginAdapter(getSupportFragmentManager(),this,tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        fb.setTranslationY(300);
        google.setTranslationY(300);
        instagram.setTranslationY(300);
        tabLayout.setTranslationY(300);
        fb.setAlpha(v);
        fb.animate().translationY(0).alpha (1).setDuration(1000).setStartDelay(400).start();
        google.animate().translationY(0).alpha (1).setDuration(1000).setStartDelay(600).start();
        instagram.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
        instagram.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(100).start();
    }
}