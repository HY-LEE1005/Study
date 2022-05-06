package com.company;

public class Cat implements Animal {
    @Override
    public void cry() {
        System.out.println("냐옹!");
    }

    @Override
    public void eat(String food) {
        System.out.println("고양이가 " + food + "를 먹는다.");
    }

    @Override
    public void sleep(int time) {
        System.out.println("고양이가 " + time + "시간을 잔다.");
    }
}
