package com.example.reactspring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="User") // @Entity(name="사용할 Entity 명") - 해당 클래스를 Entity 클래스로 사용하겠다.
@Table(name="User") // @Table(name="테이블명" - 데이터베이스에 있는 해당하는 테이블과 현재 클래스를 매핑 시키겠다.
public class UserEntity {
  @Id
  private String userEmail;
  private String userPassword;
  private String userNickname;
  private String userPhoneNumber;
  private String userAddress;
  private String userProfile;

}
