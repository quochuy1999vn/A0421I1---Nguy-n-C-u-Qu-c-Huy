package com.thi_module4.service.Impl;

import com.thi_module4.entity.Product;
import com.thi_module4.repository.IProductRepository;
import com.thi_module4.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void delete(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Optional<Product> findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public Page<Product> findAllByName(Pageable pageable, String name) {
        return productRepository.findAllByNameContaining(pageable, name);
    }

    @Override
    public Page<Product> findByPrice(Pageable pageable, int price) {
        return productRepository.findAllByPriceContaining(pageable, price);
    }

    @Override
    public Page<Product> findByProductTypeId(Pageable pageable, int id) {
        return productRepository.findAllByProductType(pageable, id);
    }
}
