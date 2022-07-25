package com.example.presentation;


import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties

public class User {
    String name;
    String email;
    String pass;
    String phone;
    int coins;
    int keys;

    public User(String name, String email, String pass, String phone, int coins, int keys){
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.phone = phone;
        this.coins = coins;
        this.keys = keys;
    }

    public User(){

    }


    public String getPass() {
        return pass;
    }

    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPhone() {
        return phone;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
