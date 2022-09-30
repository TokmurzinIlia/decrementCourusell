package com.epam.rd.autotasks;

public class Main {
    public static void main(String[] args) {

        DecrementingCarousel carousel = new DecrementingCarousel(3);

        System.out.println(carousel.addElement(-2)); //false
        System.out.println(carousel.addElement(0)); //false

        System.out.println(carousel.addElement(2)); //true
        System.out.println(carousel.addElement(3)); //true
        System.out.println(carousel.addElement(1)); //true

//carousel is full
        System.out.println(carousel.addElement(2)); //false
        CarouselRun run = carousel.run();

        System.out.println(run.next(carousel)); //2
        System.out.println(run.next(carousel)); //3
        System.out.println(run.next(carousel)); //1


    }
}
