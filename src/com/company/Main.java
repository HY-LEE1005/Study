package com.company;


interface Animal {
    void cry();
    void eat(String food);
    void sleep(int time);
}


public class Main {

    private Animal animal = null;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void cry(){
        animal.cry();
    }

    public void eat(String food){
        animal.eat(food);
    }

    public void sleep(int time){
        animal.sleep(time);
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        Lion l = new Lion();

        Main main = new Main();
        main.setAnimal(c);
        main.cry();
        main.eat("사료");
        main.sleep(9);

    }
}
