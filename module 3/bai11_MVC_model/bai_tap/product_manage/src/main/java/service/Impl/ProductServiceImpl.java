package service.Impl;

import model.Product;
import service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private static List<Product> products;

    static {
        products = new ArrayList<>();
        products.add(new Product(1, "IPhone 13", 1000, "Smart Phone", "Apple"));
        products.add(new Product(2, "S30", 2000, "Smart Phone", "SamSung"));
        products.add(new Product(3, "Mi12", 3000, "Smart Phone", "Xiaomi"));
        products.add(new Product(4, "Oppo find x3", 1500, "Smart Phone", "Oppo"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void create(int id, Product product) {
        products.add(id, product);
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void viewDetails(int id) {

    }

    @Override
    public Product searchByName(String name) {
        return products.get(Integer.parseInt(name));
    }
}
