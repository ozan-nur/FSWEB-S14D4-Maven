package org.example.model;

public class Bread extends ProductForSale {
    private boolean isWholeGrain;

    public Bread(String type, double price, String description, boolean isWholeGrain) {
        super(type, price, description);
        this.isWholeGrain = isWholeGrain;
    }

    public boolean isWholeGrain() {
        return isWholeGrain;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread: " + getType() +
                ", Price: " + getPrice() +
                ", Description: " + getDescription() +
                ", Whole Grain: " + isWholeGrain);
    }
}
