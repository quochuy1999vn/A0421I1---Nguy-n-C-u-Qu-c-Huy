package javaCollectionFramework.bai_tap.exercise_ArrayList_LinkedList;

public class Test {
    public static void main(String[] args) {
        Product product = new Product(1, "S10", 100);
        Product product1 = new Product(2, "IpXs", 200);
        Product product2 = new Product(3, "Redmi", 300);
        ProductManager manager = new ProductManager();
        manager.addProduct(product);
        manager.addProduct(product1);
        manager.addProduct(product2);

        manager.editProduct(1, 4, "Reno", 400);
        manager.displayProduct(0);
        manager.displayProduct(1);
        manager.displayProduct(2);

    }
}
