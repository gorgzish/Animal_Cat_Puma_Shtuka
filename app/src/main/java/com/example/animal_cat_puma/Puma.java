package com.example.animal_cat_puma;

import android.util.Log;

public class Puma extends Cat {

    public Puma(){

    }
    public Puma(int age, String name){
        this.age = age;
        this.name = name;
    }
    public void talk(){
        Log.i("talk()", "R-R-R. I'am puma. My name is " + name
                + ", I'am " + age + " years old");
    }
}
