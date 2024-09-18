package org.example;

public class Car implements Driveable{
    String carMake;
    int age;

    public Car() {
        this.carMake = "Lada";
        this.age = 18;
    }
    public Car(String carMake, int age) {
        this.carMake = carMake;
        this.age = age;
    }
    void sound(){
        System.out.println("honk honk");
    }

    @Override
    public void drive() {

    }
}