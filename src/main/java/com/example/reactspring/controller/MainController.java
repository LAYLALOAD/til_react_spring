package com.example.reactspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @RestController - 해당 클래스를 Controller 레이어로 Rest한 형태로 인색하게 하도록 함
// Rest한 형태 - 우리가 Request, Response라 하는 것은 이제 Response로 html을 반환하는게 일반 적인데,
// API를 태워서 데이터만 넘겨주는 형태로 할 때에는 @Controller + @ResponseBody로 지정해야 한다.
// @Controller + @ResponseBody - 데이터를 직접 보내주는 형태로 Controller를 만들겠다와 같은 뜻, 두개가 합쳐진 형태
@RequestMapping("/") // @RequestMapping(URL 패턴) - Request의 URL의 패턴을 보고 해당하는 패턴이 왔을 때 해당 클래스를 실행

public class MainController {

  @GetMapping("") // @GetMapping - Request method get post patch delete 들이 method가 mapping 될때 end point가 무엇인가? 를 받아옴
  public String hello() {
    return "Connection Successful";
  }
} // localhost에 지정한 post 번호 (8080)으로 들어갔을 때 그 중에 request url의 패턴이 그냥 8080번이고 뒤에 @GetMapping("")으로 패턴이 아무것도 존재하지 않을 때에 get method로 오면 위에것을 처리해 준다.
