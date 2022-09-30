package com.epam.rd.autotasks;

public class CarouselRun {

    DecrementingCarousel carousel;

    int i;

    int currentValue;

    public CarouselRun() {
//        if (carousel == null){
//        carousel = new DecrementingCarousel();}
//        else {
//            this.carousel = carousel;
//        }

    }

    public int next () {
        if (carousel != null) {
        currentValue = carousel.getI(i);
        carousel.setI(i, currentValue--);
        i++;}
return currentValue;
    }

    public boolean isFinished () {
        if (carousel != null && carousel.getCarousel().length != 0){
        for (int var: carousel.getCarousel()) {
            if (var > 0) return false;}
        }
        return true;

    }

    @Override
    public String toString() {
        return "CarouselRun{" +
                "carousel=" + carousel +
                ", i=" + i +
                '}';
    }
}
