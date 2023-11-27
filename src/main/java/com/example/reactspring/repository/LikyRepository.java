package com.example.reactspring.repository;

import com.example.reactspring.entity.LikyEntity;
import com.example.reactspring.entity.PopularSearchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikyRepository extends JpaRepository<LikyEntity, Integer> {

}
