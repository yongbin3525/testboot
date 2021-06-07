package com.yongbin.testboot.config.auth.dto;

import com.yongbin.testboot.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

/**
 * Date    : 2021-06-07
 * Source  : SessionUser
 * Author  : Yongbin-Lee
 * Email   : yongbin3525@gmail.com
 */
@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}