package com.yongbin.testboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Date    : 2021-06-06
 * Source  : PostsRepository
 * Author  : Yongbin-Lee
 * Email   : yongbin3525@gmail.com
 */
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
