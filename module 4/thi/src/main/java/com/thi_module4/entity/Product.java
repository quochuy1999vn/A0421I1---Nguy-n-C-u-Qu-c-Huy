package com.thi_module4.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Không được để trống")
    @Size(min = 5, max = 50)
    private String name;

    @NotNull
    @Min(value = 100000,message = "-Giá bát đầu phải là số và thấp nhất phải là 100.000 VND ")
    private int price;
    @ManyToOne
    @JoinColumn(name = "product_type_id")
    private ProductType productType;
    private String status;

    public Product() {
    }

    public Product(int id, String name, int price, ProductType customerType, String status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productType = customerType;
        this.status = status;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
