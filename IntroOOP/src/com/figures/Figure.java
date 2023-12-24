package com.figures;

public class Figure {
    private int sideNumber;
    private int sideSize;

    public Figure(int sideNumber, int sideSize){
        this.sideNumber = sideNumber;
        this.sideSize = sideSize;

    }

    public int getSideNumber() {
        return sideNumber;
    }

    public void setSideNumber(Integer sideNumber) {
        this.sideNumber = sideNumber;
    }

    public int getSideSize() {
        return sideSize;
    }

    public void setSideSize(Integer sideSize) {
        this.sideSize = sideSize;
    }
}
