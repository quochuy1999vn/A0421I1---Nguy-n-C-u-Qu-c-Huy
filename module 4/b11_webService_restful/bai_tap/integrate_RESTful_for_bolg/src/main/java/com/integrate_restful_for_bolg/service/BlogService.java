package com.integrate_restful_for_bolg.service;



import com.integrate_restful_for_bolg.model.Blog;
import com.integrate_restful_for_bolg.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService {

    @Autowired
    private BlogRepository blogRepository;


    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Page<Blog> findAllByCategoryId(Pageable pageable, Long id) {
        return blogRepository.findAllByCategoryId(pageable, id);
    }

    @Override
    public Page<Blog> findAllByName(Pageable pageable, String name) {
        return blogRepository.findAllByNameContaining(pageable, name);
    }


}
