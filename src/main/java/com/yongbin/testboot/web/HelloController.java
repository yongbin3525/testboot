package com.yongbin.testboot.web;

import com.yongbin.testboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date    : 2021-06-06
 * Source  : HelloController
 * Author  : Yongbin-Lee
 * Email   : yongbin3525@gmail.com
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }
}
