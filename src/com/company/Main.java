package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Baron", 5, "black", "Doberman");
        Scanner in = new Scanner(System.in);
        System.out.println("Menu: \n(1) Show dog name; \n(2) Show the breed of the dog; \n(3) Show the color of the dog; \n" +
                "(4) Show the number of years of the dog; \n(5) Give dog food; \n(6) 'Sit' command; \n(7) 'Sleep' command; \n(8) 'Voice' command; \n(9) Show all data about the dog; \n(10) Exit.");
        System.out.println("Please enter num: ");
        int num = in.nextInt();
        while (num < 10) {
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
                    dog1.eat();
                    break;
                case 6:
                    dog1.sit();
                    break;
                case 7:
                    dog1.sleep();
                    break;
                case 8:
                    dog1.speak("Voice");
                    break;
                case 9:
                    dog1.get();
                    break;
                default:
                    System.out.println("Value was entered incorrectly");
                    break;
            }
            System.out.println("Please enter num: ");
            num = in.nextInt();
        }
    }
}
