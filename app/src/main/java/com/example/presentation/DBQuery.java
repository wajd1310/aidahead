package com.example.presentation;

import android.service.autofill.UserData;
import android.util.ArrayMap;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.WriteBatch;

import java.util.Map;

public class DBQuery
{
    public static FirebaseFirestore g_firestore;
    public static void CreateUserData(String email,String name,MyCompleteListener completeListener){
        Map<String,Object> userData=new ArrayMap<>();
        userData.put("USER_EMAIL",email);
        userData.put("USER_NAME",name);
        userData.put("TOTAL_COINS",0);
        DocumentReference userDoc=g_firestore.collection("USERS").document(FirebaseAuth.getInstance().getCurrentUser().getUid());
        WriteBatch batch = g_firestore.batch();

        batch. set (userDoc, userData);
        DocumentReference countDoc = g_firestore.collection("USERS").document ( "TOTAL_USERS");
        batch.update (countDoc,"TOTAL_COUNT", FieldValue.increment (1));
        batch.commit().addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void unused) {
                completeListener.onSuccess();

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                completeListener.onFailure();

            }
        });
    }
}