package com.mycompany.mahakalconstuctions;

public class Plot {

    double length;
    double breadth;
    String sector;

    public Plot() {
        this.length = 50;
        this.breadth = 50;
        this.sector = "A";
    }

    public Plot(double breadth) {
        this.length = 100;
        this.breadth = breadth;
        this.sector = "B";
    }

    public Plot(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        this.sector = "C";
    }
    
    public double getArea(){
        return length* breadth;
    }

}
