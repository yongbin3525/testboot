package com.yongbin.testboot.web.dto;

import com.yongbin.testboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Date    : 2021-06-06
 * Source  : PostsSaveRequestDto
 * Author  : Yongbin-Lee
 * Email   : yongbin3525@gmail.com
 */
@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
