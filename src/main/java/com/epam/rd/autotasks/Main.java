package com.epam.rd.autotasks;

public class Main {
    public static void main(String[] args) {

       DecrementingCarousel courusel = new DecrementingCarousel(4);
       courusel.addElement(80);
       courusel.addElement(80);
       courusel.addElement(80);
       courusel.addElement(80);
        System.out.println(courusel.toString());
    }
}
