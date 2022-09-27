package com.epam.rd.autotasks;

import java.util.Arrays;

public class DecrementingCarousel {

    static int [] carousel;
    boolean carouselRun;

    int capacity;
    int i = 0;
    public DecrementingCarousel(int capacity) {

        carousel = new int[capacity];
    }

    public DecrementingCarousel() {
    }

    public boolean addElement(int element){
        boolean addElement;

        if (element > 0 && !carouselRun && i < carousel.length){
            carousel[i] = element;
            i++;
            addElement = true;
        } else {
            addElement = false;
        }
        return addElement;
        //throw new UnsupportedOperationException();

    }

    public CarouselRun run(){
        //CarouselRun run = new CarouselRun();
        if (!carouselRun){
            carouselRun = true;
            return new CarouselRun();

        }
        //throw new UnsupportedOperationException();
        return null;
    }

    @Override
    public String toString() {
        return "DecrementingCarousel{" +
                "carousel=" + Arrays.toString(carousel) +
                '}';
    }

}
