package com.company;

public class Commands {
    public void eat(){
        System.out.print("Eating...\n");
    }
    public void sit(){
        System.out.print("Sits down...\n");
    }
    public void sleep(){
        System.out.print("Sleeping zz-z-z-z...\n");
    }
    public void speak(String words){
        String phrase = words + " - Gaffe...Gaffe...Gaffe...\n";

        System.out.print(phrase);
    }
}

