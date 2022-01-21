package com.integrate_restful_for_bolg.service;

import com.integrate_restful_for_bolg.model.Category;
import com.integrate_restful_for_bolg.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService implements ICategoryService{

    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> findByAll() {
        return categoryRepository.findAll();
    }
}
