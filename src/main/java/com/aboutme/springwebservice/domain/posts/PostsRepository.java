package com.aboutme.springwebservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepository  extends JpaRepository<Posts, Long> {
}
