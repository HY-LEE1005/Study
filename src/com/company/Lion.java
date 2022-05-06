package com.company;

public class Lion implements Animal {
    @Override
    public void cry() {
        System.out.println("어흥!");
    }

    @Override
    public void eat(String food) {
        System.out.println("사자가 " + food + "를 먹는다.");
    }

    @Override
    public void sleep(int time) {
        System.out.println("사자가 " + time + "시간을 잔다.");
    }
}
