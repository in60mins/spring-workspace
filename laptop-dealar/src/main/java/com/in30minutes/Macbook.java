package com.in30minutes;

public class Macbook implements Brand{

    Processers processers;

    public Macbook(Processers processers){
        this.processers=processers;
    }

    @Override
    public void showDetailes() {
        System.out.println("You selected Macbook laptop"+processers.showProcesserDetailes());
    }
}
