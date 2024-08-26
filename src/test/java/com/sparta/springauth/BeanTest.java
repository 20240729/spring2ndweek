package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {
//    @Autowired
//    Food food;
// 자동 주입 불가. 푸드 타입으로 빈이 한 개 이상.
// 푸드 필드에 같은 타입의 빈 객체가 하나 이상이라 어떤 타입에 주입할 지 몰라서.
// 치킨 혹은 피자

//    @Autowired
//    Food pizza;
//    @Autowired
//    Food chicken;
//    // 이렇게 해야 함
//
//    //애너테이션 오토와이어드가 기본적으로는 앞의 타입으로 di대상을 찾는데,
//    // 대상이 명확하지 않으면 뒤의 이름으로 찾는다.
//
//    @Test
//    @DisplayName("테스트")
//    void test1(){
//        pizza.eat();
//        chicken.eat();
//    }

//    @Autowired
//    Food food;
//    // 푸드 아래의 치킨 클래스에 @Primary 애너테이션을 붙여 치킨이 먼저 선택되도록 함.
//
//    @Test
//    @DisplayName("테스트")
//    void test1(){
//        food.eat();
//    }

//    @Autowired
//    @Qualifier("pizza")
//    Food food;
//
//    void test1() {
//        food.eat();
//    }
//    // @Qualifier("pizza")가 피자를 선택하게 함.

// *qualifier와 primary 중 전자가 우선도가 높다.
// 범용적으로 사용되는 것엔 프라이머리, 지엽적으로 사용되는 것에 퀄리파이어
// 예) 사용의 대부분을 차지하는 것에 프라이머리를 붙이고
// 가끔 사용되는 것에 퀄을 붙여 사용


}
