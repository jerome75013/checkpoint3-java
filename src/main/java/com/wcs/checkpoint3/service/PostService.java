package com.wcs.checkpoint3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcs.checkpoint3.entity.Posts;
import com.wcs.checkpoint3.repository.PostRepository;
import com.wcs.checkpoint3.repository.UserRepository;

@Service
    public class PostService {

    @Autowired
    UserRepository UserRepo;

    @Autowired
    PostRepository PostsRepo;

    public List<Posts> getAllPosts() {
        return PostsRepo.findAll();
    }

    public Posts getPostsById(Long id) {
        return PostsRepo.findById(id).get();
    }

}