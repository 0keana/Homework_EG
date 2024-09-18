package org.example;

public class VW extends Car {
    Boolean isForeign;

    public VW(Boolean isForeign, int age, String carMake) {
        super(carMake, age);
        this.isForeign = isForeign;
    }
    public void vzhuh () {
//        sound();
        System.out.println("vzhuh!!!!");
    }
}