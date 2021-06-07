package com.yongbin.testboot.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Date    : 2021-06-07
 * Source  : Role
 * Author  : Yongbin-Lee
 * Email   : yongbin3525@gmail.com
 */
@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE_USER", "일반 사용자");

    private final String key;
    private final String title;
}
