package com.yongbin.testboot.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Date    : 2021-06-07
 * Source  : UserRepository
 * Author  : Yongbin-Lee
 * Email   : yongbin3525@gmail.com
 */
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
