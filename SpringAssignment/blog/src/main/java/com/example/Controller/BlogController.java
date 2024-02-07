package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.blog.Service.BlogService;
import com.example.blog.entity.Blog;

@RestController
public class BlogController {
    @Autowired
    private BlogService service;

    public List<Blog> retriveAll()
    {
        return service.findAll();
    }

@GetMapping("/blog/{id}")

    public Blog retriveUser(@PathVariable int id)
    {
        return service.findOne(id);
    }
    public void retriveAddBlog(@PathVariable Blog blog)
    {
        service.CreateBlog(blog);
        
    }
    

}
