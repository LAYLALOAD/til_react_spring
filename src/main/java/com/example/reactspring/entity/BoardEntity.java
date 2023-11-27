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
@Entity(name="Board")
@Table(name="Board")
public class BoardEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  // GeneratedValue(strategy = 전략) - 기본키를 자동으로 생성해주는 어노테이션
  // strategy - IDENTITY : AUTO_INCREMENT
  //          - SEQUENCE : 오라클, Postgre 시퀀스를 지원
  //          - TABLE : 키 생성 전용 테이블 만들고 이름, 값을 만들어서 시퀀스를 흉내내는 것
  private int boardNumber;
  private String boardTitle;
  private String boardContent;
  private String boardImage;
  private String boardVideo;
  private String boardFile;
  private String boardWriterEmail;
  private String boardWriterProfile;
  private String boardWriterNickname;
  private String boardWriteDate;
  private int boardClickCount;
  private int boardLikeCount;
  private int boardCommentCount;
}
