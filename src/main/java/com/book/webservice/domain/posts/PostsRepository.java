package com.book.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
