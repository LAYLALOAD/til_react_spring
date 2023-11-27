package com.example.reactspring.repository;

import com.example.reactspring.entity.CommentEntity;
import com.example.reactspring.entity.LikyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Integer> {
}
