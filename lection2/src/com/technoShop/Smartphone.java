package com.technoShop;

public class Smartphone extends Laptop{
    private int numbersOfCameras;
    public Smartphone(String model, int productionYear, double price, int numbersOfCameras) {
        super(model, productionYear, price);
        this.numbersOfCameras = numbersOfCameras;
    }

    public void printSmartphoneInfo(){
        System.out.println(this.printInfo()+" Numbers of cameras: "+this.numbersOfCameras);
    }
    public int getNumbersOfCameras() {
        return numbersOfCameras;
    }

    public void setNumbersOfCameras(int numbersOfCameras) {
        this.numbersOfCameras = numbersOfCameras;
    }
}
