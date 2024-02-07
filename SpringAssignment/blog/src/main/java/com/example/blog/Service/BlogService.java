package com.example.blog.Service;

import java.util.List;

import com.example.blog.entity.Blog;

public interface BlogService {
    public List<Blog> findAll();
    public Blog findOne(long id);
    public void CreateBlog(Blog blog);
}
