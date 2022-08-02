package com.example.presentation;


public class QuestionLibrary {

    private String mQuestions[] = {
            "What is the most important step for CPR?",
            "What should be the first step you take when you see a person collapsing on the floor? ",
            "What should be done before starting chest compressions?",
            "While performing CPR on an infant, another rescuer appears on the scene, what do you do next?",
            "How should the victim be placed while doing chest compressions?",
            "How many fingers should you place above the meeting area of the lower ribs while performing a CPR?",
            "How deep should the chest compressions be?",
            "In which cases do you perform CPR ?",


    };


    private String mChoices[][] = {
            {"Call for a professional help","Check the patient’s Pulse","Lay the patient on his back"},
            {"Call for help","Make sure the patient is breathing","Look for a response from the patient"},
            {"Look for the patient’s response.","Call for help.","Both"},
            {"Immediately transport the patient","Wait until you are exhausted, then switch","Have the second rescuer help with CPR, to minimize fatigue"},
            {"on his left side","on his back","on his right side"},
            {"3 fingers","2 fingers","All fingers"},
            {"2cm","5cm","3cm"},
            {"Coughing","No pulse","Choking"}
    };


    private String mCorrectAnswers[] = {"Call for a professional help", "Look for a response from the patient", "Both","Have the second rescuer help with CPR, to minimize fatigue","on his back","2 fingers","5cm","No pulse"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}

