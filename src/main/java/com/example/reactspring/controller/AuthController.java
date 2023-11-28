package com.example.reactspring.controller;

import com.example.reactspring.dto.ResponseDto;
import com.example.reactspring.dto.SignUpDto;
import com.example.reactspring.dto.SignUpResponseDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
  @PostMapping("/signUp")
  public ResponseDto<SignUpResponseDto> signUp(@RequestBody SignUpDto requestBody) {
    System.out.println(requestBody.toString());
    return null;
  }
}
