package com.example.reactspring.repository;

import com.example.reactspring.entity.BoardEntity;
import com.example.reactspring.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, Integer> {
  // repository: springboot(서비스 레이어)가 데이터베이스를 접근해서 쿼리문을 실행 하도록 도와줌
}
