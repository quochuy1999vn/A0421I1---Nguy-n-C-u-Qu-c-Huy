package javaCollectionFramework.bai_tap.exercise_ArrayList_LinkedList;

import java.util.ArrayList;
import java.util.Comparator;

public class ProductManager implements Comparator<Product> {
    public static ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product name) {
        products.add(name);
    }

    public void displayProduct(int id) {
        System.out.println(products.get(id).toString());
    }

    public void removeProduct(int index) {
        products.remove(products.get(index));
    }

    public void searchProduct(String name) {
        boolean check = true;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).equals(name)) {
                System.out.println("Found products in location: " + i);
                check = false;
            }
        }
        if (check) {
            System.out.println("No products found");
        }
    }

    public void editProduct(int index, int id, String name, int price) {
        products.set(index, new Product(id, name, price));
    }


    @Override
    public int compare(Product o1, Product o2) {
        return 0;
    }
}
