package com.example.presentation;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SignupAdapter extends FragmentPagerAdapter {
    private Context context;
    int totalTabs;
    public SignupAdapter(FragmentManager fm,Context context,int totalTabs){
        super(fm);
        this.context=context;
        this.totalTabs=totalTabs;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }

    @NonNull
    public Fragment getItem(int position){
        switch (position){
            case 1:
                LoginTabFragments loginTabFragment = new LoginTabFragments();
                return loginTabFragment;
            case 0:
                SignupFabFragment signupTabFragment = new SignupFabFragment();
                return signupTabFragment;

            default:
                return null;
        }
    }
}
