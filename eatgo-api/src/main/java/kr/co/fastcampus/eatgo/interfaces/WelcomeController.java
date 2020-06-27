package kr.co.fastcampus.eatgo.interfaces;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//웹에서 접속가능한 컨트롤러를 만들기 위함
@RestController
public class WelcomeController {


    //접속을 했을때 띄우기 위해 get 메소드를 사용
    @GetMapping("/")
    public String hello(){

        return "Hello World!!!";

    }

}
