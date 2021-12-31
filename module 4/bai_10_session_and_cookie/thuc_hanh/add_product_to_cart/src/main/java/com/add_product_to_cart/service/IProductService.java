package com.add_product_to_cart.service;

import com.add_product_to_cart.entity.Product;


public interface IProductService {
    Iterable<Product> findAll();
    Product findById(Long id);
}
