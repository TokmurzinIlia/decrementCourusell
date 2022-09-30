package com.epam.rd.autotasks;

public class Main {
    public static void main(String[] args) {

       DecrementingCarousel courusel = new DecrementingCarousel(4);
       courusel.addElement(1);
       courusel.addElement(2);
       courusel.addElement(3);
       courusel.addElement(7);
       //CarouselRun run = courusel.run();

        System.out.println(courusel.run());
    }
}
