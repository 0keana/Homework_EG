package org.example;

public class Lada extends Car {
    String Name;
    Boolean isLocal;

    public void sound2() {
        System.out.println("hiss");
    }

    public Lada(String carMake, int age, String name, Boolean isLocal) {
        super(carMake, age);
        Name = name;
        this.isLocal = isLocal;
    }

    public void info() {
        System.out.println(Name);
        System.out.println(isLocal);
        System.out.println(Name);
        System.out.println(age);
    }

}