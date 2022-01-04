package com.example.itccardview;

public class Grocery {

    public String productName;
    public String productPrice;
    public String productWeight;
    public String productQty;

    public Grocery(String productName, String productPrice) {

        this.productName = productName;
        this.productPrice = productPrice;

    }

    public String getProductQty() {
        return productQty;
    }

    public void setProductQty(String productQty) {
        this.productQty = productQty;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(String productWeight) {
        this.productWeight = productWeight;
    }




    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}