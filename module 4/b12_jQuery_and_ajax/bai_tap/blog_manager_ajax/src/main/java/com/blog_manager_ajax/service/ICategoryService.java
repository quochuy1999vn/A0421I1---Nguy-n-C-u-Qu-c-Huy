package com.blog_manager_ajax.service;

import com.blog_manager_ajax.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    List<Category> findByAll();

    Optional<Category> findById(Long id);
}
