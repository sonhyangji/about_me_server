package com.aboutme.springwebservice.web;

import com.aboutme.springwebservice.domain.posts.Posts;
import com.aboutme.springwebservice.domain.posts.PostsRepository;
import com.aboutme.springwebservice.dto.posts.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@AllArgsConstructor // BEAN 주입을 해당 클래스의 생성자로 받을수 있게함
public class WebRestController {

    private PostsRepository postsRepository;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld~~~";
    }

    @PostMapping("/posts")
    public Posts savePosts(@RequestBody PostsSaveRequestDto dto){
        return postsRepository.save(dto.toEntity());
    }

    /*
        @RequestBody로 외부에서 데이터를 받는 경우엔 기본생성자 + set메소드를 통해서만 값이 할당됩니다.
        그래서 이때만 setter를 허용합니다.
        */
}