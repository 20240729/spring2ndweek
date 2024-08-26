package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {
//    @Autowired
//    Food food;
    // 자동 주입 불가. 푸드 타입으로 빈이 한 개 이상.
    // 푸드 필드에 같은 타입의 빈 객체가 하나 이상이라 어떤 타입에 주입할 지 몰라서.
    // 치킨 혹은 피자

    @Autowired
    Food pizza;
    @Autowired
    Food chicken;
    // 이렇게 해야 함

    //애너테이션 오토와이어드가 기본적으로는 앞의 타입으로 di대상을 찾는데,
    // 대상이 명확하지 않으면 뒤의 이름으로 찾는다.

    @Test
    @DisplayName("테스트")
    void test1(){
        pizza.eat();
        chicken.eat();
    }


}
