package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void create(int id, Product product);
    void save(Product product);
    void update(int id, Product product);
    Product findById(int id);
    void viewDetails(int id);
    Product searchByName(String name);
}
