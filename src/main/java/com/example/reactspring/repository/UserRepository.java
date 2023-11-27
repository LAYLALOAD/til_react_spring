package com.example.reactspring.repository;

import com.example.reactspring.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
  // 상속주는 JpaRepository로 제너릭을 전달해줘야 하는데
  // 첫번째 제너릭 자리에 Entity를 기입한다.
  // UserRepository는 UserEntity를 매개체로 참조해서 데이터베이스와 통신하겠다.
  // 두번째 제너릭 자리에 UserEntity의 primary key의 타입을 지정해 준다.
}
