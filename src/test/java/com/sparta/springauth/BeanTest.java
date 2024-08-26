package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {
    @Autowired
    Food food;
    // 자동 주입 불가. 푸드 타입으로 빈이 한 개 이상.
    // 푸드 필드에 같은 타입의 빈 객체가 하나 이상이라 어떤 타입에 주입할 지 몰라서.
    // 치킨 혹은 피자




}
