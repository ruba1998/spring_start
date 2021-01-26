package com.example.spring_start.repository;

import com.example.spring_start.domain.Comment;
import com.example.spring_start.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
