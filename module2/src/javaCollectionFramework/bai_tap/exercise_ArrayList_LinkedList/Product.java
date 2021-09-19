package javaCollectionFramework.bai_tap.exercise_ArrayList_LinkedList;

public class Product {
    private int id;
    private int price;
    private String name;

    public Product() {
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.price = price;
        this.name = name;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "ID: " + this.id + " Name: " + this.name + " Price: " + this.price;
    }
}
