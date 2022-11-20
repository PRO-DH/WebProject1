package com.example.demo.todo.entity;

import lombok.*;

@Setter @Getter @ToString
// @NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 전체 필드 초기화 생성자
// 역할: 하나의 할 일 데이터의 집합 객체
public class ToDo {

    private long id; // 할일들을 식별하는 번호
    private String userId; // 할 일을 등록한 회원의 식별자
    private String title; // 할 일 내용
    private boolean done; // 할 일 완료 여부

    // 일련번호
    private static long seq;    // static 이 붙지않으면 seq가 객체당 하나씩 전부 생성되어 id가 계속 1이다.

    public ToDo() {
        this.id = ++seq;
    }
    public ToDo(String title) {
        this(); // 나의 기본생성자 호출, super() 부모클래스의 기본생성자 호출
        this.title = title;
        this.userId = "noname";
    }

}