package com.in30minutes;

public class Microsoft implements Brand{

    Processers processers;

    public Microsoft(Processers processers){
        this.processers=processers;
    }

    @Override
    public void showDetailes() {
        System.out.println("you are selected Microsoft laptop"+processers.showProcesserDetailes());
    }
}
