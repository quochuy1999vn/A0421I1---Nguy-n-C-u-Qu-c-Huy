package com.extended_blog.controller;


import com.extended_blog.model.Blog;
import com.extended_blog.model.Category;
import com.extended_blog.repository.CategoryRepository;
import com.extended_blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    private IBlogService blogService;

    @Autowired
    private CategoryRepository categoryRepository;
    @ModelAttribute("listCategory")
    public List<Category> categoryList() {
        return categoryRepository.findAll();
    }

    @GetMapping("/list")
    public ModelAndView showlist( Optional<String> key_search, Optional<Long> cateId,
                                  @PageableDefault(size = 2) Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("/list");
        //Nếu key_search không có giá trị, tức là người dùng không nhập vào.
        if (!key_search.isPresent()) {
            //Nếu người dùng nhập vào ô category thì chạy.
            if (cateId.isPresent()) {
                modelAndView.addObject("cateId", cateId.get());
                modelAndView.addObject("blogs", blogService.findAllByCategoryId(pageable, cateId.get()));
            }else {
                //TH cả 2 ô điều không được nhập
                modelAndView.addObject("blogs", blogService.findAll(pageable));
            }
        }else {
            //TH ô name được nhập
            modelAndView.addObject("blogs", blogService.findAllByName(pageable, key_search.get()));
        }
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("blogs", new Blog());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute("blog") Blog blog) {
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("blogs", new Blog());
        modelAndView.addObject("message", "Create new blog successfully");
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Optional<Blog> blog = blogService.findById(id);
        if (blog.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/edit");
            modelAndView.addObject("blogs", blog.get());
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit")
    public ModelAndView edit(@ModelAttribute("blog") Blog blog) {
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("blogs", blog);
        modelAndView.addObject("message", "Blog updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        Optional<Blog> blog = blogService.findById(id);
        if (blog.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/delete");
            modelAndView.addObject("blogs", blog.get());
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("blog") Blog blog) {
        blogService.remove(blog.getId());
        return "redirect:list";
    }

    @GetMapping("/view/{id}")
    public ModelAndView showViewForm(@PathVariable Long id) {
        Optional<Blog> blog = blogService.findById(id);
        if (blog.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/view_detail");
            modelAndView.addObject("blogs", blog.get());
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }
}
