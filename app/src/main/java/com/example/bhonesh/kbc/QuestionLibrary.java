package com.example.bhonesh.kbc;


public class QuestionLibrary {

    private String mQuestions [] = {

        "With reference to a wedding, What does “Laal Joda” means ?",
          "What is the common name for surgery conducted on coronary arteries that supply blood to the heart ?",
            "How many players of a Kho-Kho team can play on the field during the match ?",
            "Which of these Indian cities is closest to the Pakistani city of Lahore ?",
            "Which part of the plant holds it in the soil?",




            "This part of the plant absorbs energy from the sun.",
            "This part of the plant attracts bees, butterflies and hummingbirds.",
            "The _______ holds the plant upright.",
            "Who was the first prime minister of india?",
            "YOU HAVE FINISHED THE GAME!!!"


    };


    private String mChoices [][] = {

            {"Pair of bangles","Set of Clothes","Milani of Samdhis"},
            {"Gastric","Bypass","Debridement"},
            {"10","9","8"},
            {"Jaisalmer","amritsar","Udhampur"},



            {"Roots", "Stem", "Flower"},
            {"Fruit", "Leaves", "Seeds"},
            {"Bark", "Flower", "Roots"},
            {"Flower", "Leaves", "Stem"},
            {"Jawahar L. Nehru", "Mahatma Gandhi", "Subhash C. Bose"},
            {"","",""}

    };



    private String mCorrectAnswers[] =

            {
                    "Set of Clothes", "Bypass","9",
                    "amritsar","Roots", "Leaves", "Flower",
                    "Stem","Jawahar L. Nehru",""

            };




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
