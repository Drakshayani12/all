package com.example.blog.Service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.blog.entity.Blog;
@Service
public class BlogServiceimpl implements BlogService{

    private ArrayList<Blog> b = new ArrayList<>();
    @Override
    public List<Blog> findAll() {
       return b;
    }

    @Override
    public Blog findOne(long id) {
       for(Blog p : b)
       {
        if(p.getId()==id)
        {
            return p;
        }
       }
       return null;
    }

    @Override
    public void CreateBlog(Blog blog) {
       b.add(blog);
   
    }
    
}
