package com.integrate_restful_for_bolg.repository;

import com.integrate_restful_for_bolg.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
