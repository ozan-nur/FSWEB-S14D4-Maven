package org.example.model;

public class Chocolate extends ProductForSale {
    private double cocoaPercentage;

    public Chocolate(String type, double price, String description, double cocoaPercentage) {
        super(type, price, description);
        this.cocoaPercentage = cocoaPercentage;
    }

    public double getCocoaPercentage() {
        return cocoaPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate: " + getType() +
                ", Price: " + getPrice() +
                ", Description: " + getDescription() +
                ", Cocoa: " + cocoaPercentage + "%");
    }
}
