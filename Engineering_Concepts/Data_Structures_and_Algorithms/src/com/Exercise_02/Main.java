package com.Exercise_02;

import com.Exercise_01.product;

class Main{
    public static void main(String[] args) {
        products[] pdt = {
                new products(101 , "Laptop" , "Electronics"),
                new products(102, "Shoes", "Fashion"),
                new products(103, "Phone", "Electronics"),
                new products(104, "Watch", "Accessories")
        };
        products p = linearSearch(pdt , 104);

        if(p != null) p.display();
        else System.out.println("Product not found");


        products pB = binarySearch(pdt , 104);

        if(pB != null) pB.display();
        else System.out.println("Product not found");
    }
    public static products linearSearch(products[]pdt , int key)
    {
        for(products p : pdt)
        {
            if(p.productId == key) return p;
        }
        return null;
    }
    public static products binarySearch(products[]pdt , int key)
    {
        int l = 0 ;
        int r = pdt.length -1;

        while(l <= r)
        {
            int mid = l + (r - l) /2 ;
            if(pdt[mid].productId == key) return pdt[mid];

            else if(pdt[mid].productId > key)  r = mid - 1;

            else l = mid + 1;
        }
        return null;
    }
}