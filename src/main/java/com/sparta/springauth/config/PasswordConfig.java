package com.sparta.springauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
// 등록하고자 하는 메서드 위에 빈 애너테이션
// 등록하고자 하는 메서드가 속한 클래스 위에 Configuration 애너테이션
// 이렇게 하면 spring ioc container에 빈으로 저장됨
// 빈으로 등록될때 클래스명 첫글자 소문자로 바뀌며 저장됨
// 메서드 명도 마찬가지
//