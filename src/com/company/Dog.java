package com.company;

public class Dog extends Commands{
    public String name;
    public int age;
    public String color;
    public String breed;
    public Dog (String name, int age, String color, String breed){
        this.age = age;
        this.name = name;
        this.color =  color;
        this.breed = breed;
    }
    public void getAge(){
        System.out.println(age + " years");
    }
    public void getName(){
        System.out.println("Alias: " + name);
    }
    public void getColor(){
        System.out.println("Color: " + color );
    }
    public void getBreed() {
        System.out.println("Breed of dog: " + breed);
    }
    public void get(){
        System.out.println("Alias: " + name + "\n" + "Color: " + color + "\n" +
                 "Breed of dog: " + breed + "\n" + "Age: " + age + " years");

    }
}