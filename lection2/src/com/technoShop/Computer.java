package com.technoShop;

public class Computer extends Technique{
    private String monitorModel;

    public Computer(String model, int productionYear, double price){
        super(model, productionYear, price);
    }
    public Computer(String model, int productionYear, double price, String monitorModel){
        super(model, productionYear, price);
        this.monitorModel = monitorModel;
    }

    public void printComputerInfo() {
        System.out.println(this.printInfo() + " Monitor: "+this.monitorModel);
    }
    public String getMonitorModel(){
        return this.monitorModel;
    }
    public void setMonitorModel(String monitorModel){
        this.monitorModel = monitorModel;
    }
}
