package com.complete_shopping_cart.service;

import com.complete_shopping_cart.entity.Product;


public interface IProductService {
    Iterable<Product> findAll();

    Product findById(Long id);

    void save(Product product);

    void remove(Long id);
}
