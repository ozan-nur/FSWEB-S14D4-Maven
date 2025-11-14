package org.example.model;

public class Store {

    public void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Dark", 5.5, "Rich dark chocolate", 70);
        products[1] = new Coke("Coke Zero", 2.5, "Zero sugar cola", 0);
        products[2] = new Bread("Whole Wheat", 3.0, "Healthy bread", true);

        Store store = new Store();
        store.listProducts(products);
    }
}
