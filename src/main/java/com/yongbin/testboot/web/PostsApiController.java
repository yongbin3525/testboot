package com.yongbin.testboot.web;

import com.yongbin.testboot.service.posts.PostsService;
import com.yongbin.testboot.web.dto.PostsResponseDto;
import com.yongbin.testboot.web.dto.PostsSaveRequestDto;
import com.yongbin.testboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * Date    : 2021-06-06
 * Source  : PostsApiController
 * Author  : Yongbin-Lee
 * Email   : yongbin3525@gmail.com
 */

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long Update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById (@PathVariable Long id){
        return postsService.findById(id);
    }
}
