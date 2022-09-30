package com.epam.rd.autotasks;

import java.util.Arrays;

public class DecrementingCarousel {
    //CarouselRun carouselRun;
    int [] carousel;
    boolean isRun;

    int capacity;
    int i = 0;
    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        carousel = new int[capacity];
        //this.carouselRun = new CarouselRun();
    }


    public DecrementingCarousel() {
    }

    public boolean addElement(int element){
        boolean addElement;

        if (element > 0 && !isRun && i < carousel.length){
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

        if (!isRun) {
            isRun = true;
            return new CarouselRun();
        }
        return null;
    }

    @Override
    public String toString() {
        return "DecrementingCarousel{" +
                "carousel=" + Arrays.toString(carousel) +
                '}';
    }

    public int getI(int i) {
        return  carousel[i];
    }

    public void setI(int i, int value) {
        this.carousel[i] = value;
    }

    public int[] getCarousel() {
        return carousel;
    }
}
