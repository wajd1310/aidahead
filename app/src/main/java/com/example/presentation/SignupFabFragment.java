package com.example.presentation;

import static android.os.Build.VERSION_CODES.S;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
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

import java.nio.charset.StandardCharsets;

public class SignupFabFragment extends Fragment {
    float v=0;
    Button signup;
    EditText email,pass,test,phone;
    FirebaseAuth mAuth;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_fragment,container,false);
        phone =root.findViewById(R.id.phone_num);
        pass=root.findViewById(R.id.pass);
        test = root.findViewById(R.id.confirm);
        signup = root.findViewById(R.id.button);
        email=root.findViewById(R.id.email);
        email.setTranslationX(800);
        pass.setTranslationX(800);
        test.setTranslationX(800);
        signup.setTranslationX(800);
        phone.setTranslationX(800);
        email.setAlpha(v);
        pass.setAlpha(v);
        test.setAlpha(v);
        phone.setAlpha(v);
        signup.setAlpha(v);
        email.animate().translationX(0).alpha(1).setDuration (800).setStartDelay(300).start();
        pass.animate().translationX(0).alpha (1).setDuration (800).setStartDelay(500).start();
        test.animate().translationX(0).alpha (1).setDuration (800).setStartDelay(500).start();
        phone.animate().translationX(0).alpha(1).setDuration (800).setStartDelay (700).start();
        signup.animate().translationX(0).alpha(1).setDuration (800).setStartDelay (700).start();
        mAuth=FirebaseAuth.getInstance();
        signup.setOnClickListener(view->{
            createUser();
            startActivity(new Intent(getActivity(), LoginActiv.class));
        });
        return root;
    }
    private void createUser(){
        String email1= email.getText().toString();
        String password=pass.getText().toString();
        String test1=test.getText().toString();
        if (TextUtils.isEmpty(email1)) {
            email.setError("Email cannot be empty");
            email.requestFocus();
        }
        else if (TextUtils.isEmpty(password)){
                pass.setError("Password cannot be empty");
                pass.requestFocus();
            }
        else{
                mAuth.createUserWithEmailAndPassword(email1, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete (@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(getActivity(),"User registered successfully", Toast.LENGTH_SHORT).show();
                            startActivity (new Intent( getActivity(), LoginActiv.class));
                        }else{
                            Toast.makeText(getActivity(),"Registration Error: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }

                    }
                    });
                }
    }
}
