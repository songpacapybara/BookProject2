package com.jojoldu.book.springboot;
//메인클래스 프로젝트 최상단에 위치 내장 WAS를 실행한다.
//내장WAS를 권장하는 이유는 언제 어디서나 같은 환경에서 스프링 부트를 배포할 수 있기 때문

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
