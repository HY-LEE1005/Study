package com.company;

public class Dog implements Animal {
    @Override
    public void cry() {
        System.out.println("멍멍!");
    }

    @Override
    public void eat(String food) {
        System.out.println("강아지가 " + food + "를 먹는다.");
    }

    @Override
    public void sleep(int time) {
        System.out.println("강아지가 " + time + "시간을 잔다.");
    }
}
