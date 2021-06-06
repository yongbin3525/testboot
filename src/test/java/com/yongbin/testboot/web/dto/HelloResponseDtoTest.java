package com.yongbin.testboot.web.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Date    : 2021-06-06
 * Source  : HelloResponseDtoTest
 * Author  : Yongbin-Lee
 * Email   : yongbin3525@gmail.com
 */
public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount())
                .as("amount value")
                .isEqualTo(1000);

    }

}