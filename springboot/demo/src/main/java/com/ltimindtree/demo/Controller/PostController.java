package com.ltimindtree.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ltimindtree.demo.Entity.Post;
import com.ltimindtree.demo.Service.PostService;

@RestController
public class PostController {
    @Autowired
    private PostService postService;

@GetMapping("/post")
    public List<Post> getAllPosts(){
    return postService.getAllPosts();
    }

@GetMapping("/post/{postId}")
    public Post getPostById(@PathVariable Long postId)
    {
        return postService.getPostById(postId);
    }

    @PostMapping("/post")
    public Post createPost(@RequestBody Post post)
    {
        return postService.createPost(post);
    }
}
