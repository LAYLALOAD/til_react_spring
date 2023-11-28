import {useState} from 'react';
import axios from "axios";

export default function SignUp() {
    const [requestResult, setRequestResult] = useState('');

        const signUpHandeler = () => {
            const data = {
                "userEmail" : "abc@gmail.com",
                "userPassword" : "qwer1234!!",
                "userPasswordCheck" : "qwer1234!!",
                "userNickname" : "everything",
                "userPhoneNumber" : "010-1111-9999",
                "userAddress" : "대한민국 서울시",
                "userAddressDetail" : "서초구",
                "userProfile" : "profileimg"
            };
            axios
                .post('http://localhost:8080/api/auth/signUp', data)
                .then((response) => {
                    setRequestResult('Success!!');
                })
                .catch((error) => {
                    setRequestResult('Failed!!');
                })
        };

    return (
        <div>
            <h3>{requestResult}</h3>
            <button onClick={() => signUpHandeler()}>회원가입</button>
        </div>
    )
}