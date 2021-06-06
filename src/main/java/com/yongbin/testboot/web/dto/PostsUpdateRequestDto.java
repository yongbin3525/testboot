package com.yongbin.testboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Date    : 2021-06-06
 * Source  : PostUpdataRequestDto
 * Author  : Yongbin-Lee
 * Email   : yongbin3525@gmail.com
 */
@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {
    private String title;
    private String content;

    @Builder
    public PostsUpdateRequestDto(String title, String content){
        this.title = title;
        this.content = content;
    }
}
