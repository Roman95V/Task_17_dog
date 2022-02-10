package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Baron",5, "black", "Doberman");
        Commands commands = new Commands();
        System.out.println("Please enter num ");
        Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            switch (num) {
                case 1:
                    dog1.getName();
                    break;
                case 2:
                    dog1.getBreed();
                    break;
                case 3:
                    dog1.getColor();
                    break;
                case 4:
                    dog1.getAge();
                    break;
                case 5:
                    commands.eat();
                    break;
                case 6:
                    commands.sit();
                    break;
                case 7:
                    commands.sleep();
                    break;
                case 8:
                    commands.speak("Voice");
                    break;
                case 9:
                    dog1.set();
                    break;
                case 10:
                    break;
                default:
                    System.out.println("Value was entered incorrectly");
                    break;
            }
    }
}
