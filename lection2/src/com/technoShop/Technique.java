package com.technoShop;

public class Technique {
    private String model;
    private int productionYear;
    private double price;

    Technique(String model, int productionYear, double price) {
        this.model = model;
        this.productionYear = productionYear;
        this.price = price;
    }

    protected String printInfo() {
        return "Technics: "+this.model+" Production year: "+this.productionYear+" Price: "+this.price;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
