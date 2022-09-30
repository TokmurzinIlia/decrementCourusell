package com.epam.rd.autotasks;

public class CarouselRun {

    //DecrementingCarousel carousel;

    int i=0;

    int currentValue;


    public int next (DecrementingCarousel carousel) {
        if (isFinished(carousel)) {

        return currentValue =-1;}
        else {
            while (carousel.getCarousel()[i %= carousel.getCarousel().length] <= 0){
                i++;
            }
            currentValue = carousel.getCarousel()[i++]--;
        }
return currentValue;
    }

    public boolean isFinished (DecrementingCarousel carousel) {
        if (carousel != null && carousel.getCarousel().length != 0){
        for (int var: carousel.getCarousel()) {
            if (var > 0) return false;}
        }
        return true;

    }

}
