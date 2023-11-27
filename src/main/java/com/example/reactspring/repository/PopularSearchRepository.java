package com.example.reactspring.repository;

import com.example.reactspring.entity.BoardEntity;
import com.example.reactspring.entity.PopularSearchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PopularSearchRepository extends JpaRepository<PopularSearchEntity, String> {
}
