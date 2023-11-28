package com.example.reactspring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(staticName = "set") // 이름을 지정해서 만들도록 함, 그냥 @AllArgsConstructor를 쓰게되면 new 써서 작성해야함, (staticName="set"): 이 이름을 고정된 이름으로 쓰겠다.
public class ResponseDto<D> {
  private boolean result;
  private String message;
  private D data; // 제너릭 D data

  // 성공했을 때 인스턴스 만들어 주는 메서드
  // 메서드에서 제너릭을 사용할 때에는 반환 타입 앞에 지정해 줘야 한다.
  // 반환 타입은 생성된 애를 생성자로 생성한 ResponseDto 인스턴스를 반환함
  public static <D> ResponseDto<D> setSuccess(String message, D data) {
    //ResponseDto에 인스턴스를 생성해서 반환 해줌
    return ResponseDto.set(true, message, data); // new ResponseDto<D>(true, message, data); -> @AllArgsConstructor staticName지정해 줘서 new 안써도 됨
  }
  // 실패 했을 때 인스턴스 만들어 주는 메서드
  // 실패 했을 때 반환해 주는 ResponseDto 작성
  public static <D> ResponseDto<D> setFailed(String message) {
    return ResponseDto.set(false, message, null);
  }
}
