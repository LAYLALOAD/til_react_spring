package com.example.reactspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="Liky")
@Table(name="Liky")
public class LikyEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int likyid;
  private int boardNumber;
  private String userEmail;
  private String likeUserProfile;
  private String likeUserNickname;
}
