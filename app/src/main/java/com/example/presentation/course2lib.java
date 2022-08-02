package com.example.presentation;

public class course2lib {
    private String Steps[]={
            "Step 1","Step 2","Step 3","Step 4"
    };
    private String ImageLib[]={
            "https://cdn-icons-png.flaticon.com/512/6032/6032482.png","https://cdn-icons-png.flaticon.com/512/4534/4534971.png","https://cdn-icons-png.flaticon.com/512/7506/7506807.png","https://cdn-icons-png.flaticon.com/512/6969/6969349.png"
    };
    private String Paragraphs[][]={
            {"Share your location and phone number.","Provide some details."},{"Describe the situation and number of people involved.",""}
            ,{"Describe the condition of the victim,","let them know if anyone else is providing assistance."},{"Follow the instructions from the dispatcher.","They may ask you to administer first aid."}};

    public String getSteps(int a) {
        String step =Steps[a];
        return step;
    }
    public String getImage(int a) {
        String image = ImageLib[a];
        return image;
    }
    public String getParagraphs1(int a) {
        String paragraph = Paragraphs[a][0];
        return paragraph;
    }
    public String getParagraphs2(int a) {
        String paragraph = Paragraphs[a][1];
        return paragraph;
    }
}