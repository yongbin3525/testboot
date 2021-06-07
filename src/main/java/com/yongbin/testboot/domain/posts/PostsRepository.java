package com.yongbin.testboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Date    : 2021-06-06
 * Source  : PostsRepository
 * Author  : Yongbin-Lee
 * Email   : yongbin3525@gmail.com
 */
public interface PostsRepository extends JpaRepository<Posts, Long> {
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}
