package com.blog.service;

import com.blog.model.Blog;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public interface IBlogService {
    List<Blog> findAll();

    Optional<Blog> findById(Long id);

    void save(Blog blog);

    void remove(Long id);
}
