package com.thi_module4.repository;

import com.thi_module4.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {

    Page<Product> findAll(Pageable pageable);

    Page<Product> findAllByNameContaining(Pageable pageable, String name);

    Page<Product> findAllByPriceContaining(Pageable pageable, int price);

    @Query("select productType from Product")
    Page<Product> findAllByProductType(Pageable pageable, int id);

}
