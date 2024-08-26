package com.sparta.springauth.food;

public interface Food {
    void eat();
}

// 인터페이스를 구현하는 구현체 클래스를 @컴포넌트 등으로 빈으로 등록하면 해당 인터페이스가 빈으로 등록됨