package com.ltimindtree.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltimindtree.demo.Entity.Post;
import com.ltimindtree.demo.Repository.PostRepository;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    public Post getPostById(Long postId)
    {
        return postRepository.findById(postId).get();
    }

    public Post createPost(Post post)
    {
        return postRepository.save(post);
    }
}
