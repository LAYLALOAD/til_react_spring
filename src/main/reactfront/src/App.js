import logo from './logo.svg';
import './App.css';
import {useEffect, useState} from "react";
import axios from "axios";

function App() {
  // 화면에 뿌려지는 특히 상태가 변수를 지정 -> state를 사용
  //   const [connection, setConnection] = useState<string>('');
  //         [사용할 상태 (state를 선언), 상수를 변경시켜줄 애 (set state명)], (''): state의 초기화 값
  const [connection, setConnection] = useState('');

  // connectionTest라는 함수를 만들어 줌
  const connectionTest = () => {
      // axios를 사용함, 8080을 보내고 결과가 성공적 이면 response를 받아줌
      axios.get('http://localhost:8080/').then((response) => {
          // response에 받을 body 데이터를 가져옴, 받은 response 데이터로 conncection state를 변경시켜 줌 -> set 이라는 메소드를 사용함
          setConnection(response.data);
      // 만약 error가 발생했다면
      }).catch((error) => {
          // 해당 error의 message를 conncection으로 적용시킴
          setConnection(error.message);
      })
  }

  // connectionTest를 실행시켜줘야 connectionTest 메소드가 돌아갈 것이다.
  // connectionTest를 실행시킬 때는 이 페이지가 로드 될때 한번 돌도록 한다 -> useEffect 사용
  // 첫실행때 한번 돌으라는 용도로 쓰는 건 아니고
  // 원래는 특정한 state가 상태가 바뀌면 useEffect 안에 있는 코드 블럭이 실행 된다
  // 여기서는 호출하는 용도로 사용하겠다
    useEffect(() => {
        // () => {connectionTest();} : 콜백함수
        // [] : 배열 안에는 어떠한 상태(값)가 바뀌면 useEffect가 돌아라 라고 지정, 비워 놓으면 맨 처음 한번만 실행된다.
        connectionTest();
    }, []);

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        {/*return 자리에 component html 적어줄 건데, {}에 JavaScript문을 쓰겠다, 변수 state를 넣겠다*/}
        <p>{connection}</p>
      </header>
    </div>
  );
}

export default App;
