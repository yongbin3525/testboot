package com.yongbin.testboot.web.dto;

import com.yongbin.testboot.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * Date    : 2021-06-06
 * Source  : PostsResponseDto
 * Author  : Yongbin-Lee
 * Email   : yongbin3525@gmail.com
 */
@Getter
public class PostsListResponseDto {
    private final Long id;
    private final String title;
    private final String author;
    private final LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
    }
}
