package com.technoShop;

public class Laptop extends Computer{
    private int timeBattery;
    private boolean transfer;

    public Laptop(String model, int productionYear, double price) {
        super(model, productionYear, price);
    }
    public Laptop(String model, int productionYear, double price, int timeBattery, boolean transfer) {
        super(model, productionYear, price);
        this.timeBattery = timeBattery;
        this.transfer = transfer;
    }

    public void printLaptopInfo() {
        System.out.println(this.printInfo()+" Battery time: "+this.timeBattery+" Transfer Laptop: "+this.transfer);
    }
    public int getTimeBattery() {
        return timeBattery;
    }

    public void setTimeBattery(int timeBattery) {
        this.timeBattery = timeBattery;
    }

    public boolean isTransfer() {
        return transfer;
    }

    public void setTransfer(boolean transfer) {
        this.transfer = transfer;
    }
}
