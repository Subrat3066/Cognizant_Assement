package com.Exercise_01;

public class product {

    private int productId;
    private String productName;
    private double productPrice;
    private int productQuantity;

    public product(int productId, String productName, double productPrice, int productQuantity)
    {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }
    public String getProductName()
    {
        return this.productName;
    }

    public int getQuantity()
    {
        return this.productQuantity;
    }

    public int getProductId()
    {
        return this.productId;
    }

    public double getProductPrice()
    {
        return this.productPrice;
    }

    public void setProductName(String name)
    {
        this.productName = name;
    }
    public void setProductPrice(double price)
    {
        this.productPrice = price;
    }
    public void setProductQuantity(int quantity)
    {
        this.productQuantity = quantity;
    }




}
