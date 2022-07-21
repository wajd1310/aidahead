package com.example.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginTabFragments extends Fragment {
    float v=0;
    Button login;
    EditText email,pass;
    TextView forgetPass,signup;
    FirebaseAuth mAuth;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment,container,false);
        email =root.findViewById(R.id.email);
        pass=root.findViewById(R.id.pass);
        forgetPass = root.findViewById(R.id.pass);
        signup=root.findViewById(R.id.signup);
        login = root.findViewById(R.id.button);
        email.setTranslationX(800);
        pass.setTranslationX(800);
        forgetPass.setTranslationX(800);
        signup.setTranslationX(800);
        login.setTranslationX(800);
        email.setAlpha(v);
        pass.setAlpha(v);
        signup.setAlpha(v);
        forgetPass.setAlpha(v);
        login.setAlpha(v);
        email.animate().translationX(0).alpha(1).setDuration (800).setStartDelay(300).start();
        pass.animate().translationX(0).alpha (1).setDuration (800).setStartDelay(500).start();
        forgetPass.animate().translationX(0).alpha (1).setDuration (800).setStartDelay(500).start();
        login.animate().translationX(0).alpha(1).setDuration (800).setStartDelay (700).start();
        signup.animate().translationX(0).alpha(1).setDuration (800).setStartDelay (700).start();
        signup.setOnClickListener((view -> startActivity(new Intent(getActivity(), SignupActiv.class))));
        mAuth=FirebaseAuth.getInstance();
        return root;
    }
}
