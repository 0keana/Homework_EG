package org.example;

public class Main {
    public static void main(String[] args) {

        Lada myLada = new Lada("Lada", 18, "lastochka", true);

        myLada.sound2();
        myLada.info();

        VW myVW = new VW(true, 6, "VW");

        myVW.vzhuh();
    }


}