package com.integrate_restful_for_bolg.repository;


import com.integrate_restful_for_bolg.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {
    public Page<Blog> findAllByCategoryId(Pageable pageable, Long id);
    public Page<Blog> findAllByNameContaining(Pageable pageable, String name);
}
