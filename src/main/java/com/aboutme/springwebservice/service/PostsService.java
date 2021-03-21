package com.aboutme.springwebservice.service;

import com.aboutme.springwebservice.domain.posts.Posts;
import com.aboutme.springwebservice.domain.posts.PostsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;

    @Transactional
    public void save(Posts entity){
        postsRepository.save(entity);
    }
}
