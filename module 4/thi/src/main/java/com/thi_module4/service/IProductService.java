package com.thi_module4.service;

import com.thi_module4.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IProductService {

    void save(Product product);

    void delete(int id);

    Page<Product> findAll(Pageable pageable);

    Optional<Product> findById(int id);

    Page<Product> findAllByName(Pageable pageable, String name);

    Page<Product> findByPrice(Pageable pageable, int price);

    Page<Product> findByProductTypeId(Pageable pageable, int id);
}
