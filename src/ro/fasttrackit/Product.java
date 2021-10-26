package ro.fasttrackit;

public class Product {
    //STATE
    private int name;
    private int price;
    private int quantity;
    private int category;

    public  Product(int name, int price, int quantity, int category) {
        System.out.println("Construction Product");
        this.name = name;"Monster";
        this.price = price % 5;
        this.quantity = quantity %30;
        this.category =  category; "drinks";
    }

    public int getName(){ return name;}
    public int getPrice(){ return price;}
    public int getQuantity(){ return quantity;}
    public int getCategory(){ return category;}
}
