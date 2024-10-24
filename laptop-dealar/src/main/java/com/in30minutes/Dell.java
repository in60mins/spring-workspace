package com.in30minutes;

public class Dell implements Brand{

    Processers processers;

    public Dell(Processers processers){
        this.processers=processers;
    }

    @Override
    public void showDetailes() {
        System.out.println("You are selected Dell laptop"+processers.showProcesserDetailes());
    }
}
