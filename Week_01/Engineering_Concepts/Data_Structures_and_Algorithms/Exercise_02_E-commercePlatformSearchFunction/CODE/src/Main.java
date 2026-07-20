package src;

class Main{
    public static void main(String[] args) {
        products[] pdt = {
                new products(101 , "Laptop" , "Electronics"),
                new products(102, "Shoes", "Fashion"),
                new products(103, "Phone", "Electronics"),
                new products(104, "Watch", "Accessories")
        };

        System.out.println("Linear Search");
        products p = searchServices.linearSearch(pdt , 104);

        if(p != null) p.display();
        else System.out.println("Product Not Found");

        System.out.println("Binary Search");
        products p2 = searchServices.binarySearch(pdt , 104);

        if(p != null) p2.display();
        else System.out.println("Product Not Found");


    }
}