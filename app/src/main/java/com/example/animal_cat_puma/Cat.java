package com.example.animal_cat_puma;
import android.util.Log;
public abstract class Cat extends Animal {
    int age;
    String name;
    final static int numberOfLegs = 4;
    static int count = 0;

    String HelloText;
    CatMood catMood;

    static class CountResetter{
        boolean moreThan100;
        CountResetter (){
            if (Cat.count > 100){
                moreThan100 = true;
            }
            if (moreThan100) {
                resetCounter(0);
            }
        }
        void resetCounter(int value) {
            Cat.count = value;
        }
    }

    class CatMood{
        int levelOfMood;
        CatMood(){
            if (Cat.this.age < 2){
                levelOfMood = 100;
            }  else if (Cat.this.age >= 2 && Cat.this.age < 7){
                levelOfMood = 50;
            } else if (Cat.this.age >= 7){
                levelOfMood = 20;
            }
        }
    }
    public Cat(){
        count++;
        this.name = "John Doe";
        this.age = -1;
        catMood = new CatMood();
        switch (catMood.levelOfMood){
            case 100:
                HelloText = "Meow! I'am happy cat. My name is " + name
                    + ", I'am " + age + " years old";
                break;
            case 50:
                HelloText = "Meow! I'am cat. My name is " + name
                        + ", I'am " + age + " years old";
                break;
            case 20:
                HelloText = "Meow! I'am old and sick cat:( My name is " + name
                        + ", I'am " + age + " years old";
                break;
        }
    }
    public Cat(int age, String name){
        count++;
        this.age = age;
        this.name = name;
        catMood = new CatMood();
        switch (catMood.levelOfMood){
            case 100:
                HelloText = "Meow! I'am happy cat. My name is " + name
                        + ", I'am " + age + " years old";
                break;
            case 50:
                HelloText = "Meow! I'am cat. My name is " + name
                        + ", I'am " + age + " years old";
                break;
            case 20:
                HelloText = "Meow! I'am old and sick cat:( My name is " + name
                        + ", I'am " + age + " years old";
                break;
        }
    }
    public void talk(){
        Log.i("talk()", HelloText);
    }

    public void talk(int age){
        Log.i("talk()", "I'am " + age + " years old");
    }

    public void talk(String hello){
        Log.i("talk()", "Meow! " + hello);
    }

    public final static String whatCatsLike() {
        return " I like playing, jumping and sometimes scratching";
    }

    public void catchMouse(int mouseWeight){
        class Mouse {
            String color;
            int weight;

            public Mouse(String color, int weight){
                this.color = color;
                this.weight = weight;
            }

            String mouseVoice(){
                return "Pi-pi-pi";
            }
        }
        Mouse mouse = new Mouse("White", mouseWeight);
        if (mouse.weight < 1){
            Log.i("cat say ", "I will eat you!" + mouse.mouseVoice());
        }
        else {
            Log.i("cat say ", "I afraid you!");
        }
    }
}