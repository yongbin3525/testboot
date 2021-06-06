package com.yongbin.testboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Date    : 2021-06-06
 * Source  : HelloResponseDto
 * Author  : Yongbin-Lee
 * Email   : yongbin3525@gmail.com
 */
@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
