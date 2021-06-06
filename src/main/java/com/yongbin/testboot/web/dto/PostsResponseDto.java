package com.yongbin.testboot.web.dto;

import com.yongbin.testboot.domain.posts.Posts;
import lombok.Getter;

/**
 * Date    : 2021-06-06
 * Source  : PostsResponseDto
 * Author  : Yongbin-Lee
 * Email   : yongbin3525@gmail.com
 */
@Getter
public class PostsResponseDto {
    private final Long id;
    private final String title;
    private final String content;
    private final String author;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
