package com.yongbin.testboot.domain.posts;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Date    : 2021-06-06
 * Source  : PostsRepositoryTest
 * Author  : Yongbin-Lee
 * Email   : yongbin3525@gmail.com
 */
@ExtendWith(SpringExtension.class)
@DataJpaTest
class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @Test
    public void 게시글저장_불러오기() {
        //given
        String title = "글제목";
        String content = "글 내용";

        postsRepository.save(Posts.builder()
                        .title(title)
                        .content(content)
                        .author("test@test.com")
                        .build());

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }
}