package com.blog_manager_ajax.service;

import com.blog_manager_ajax.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public interface IBlogService {
    public List<Blog> findAll();

    public Optional<Blog> findById(Long id);

    public void save(Blog blog);

    public void remove(Long id);

    public Page<Blog> findAll(Pageable pageable);

    public Page<Blog> findAllByCategoryId(Pageable pageable, Long id);

    public Page<Blog> findAllByName(Pageable pageable, String name);
}
