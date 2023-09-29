package com.octavian.zooclub;

public class Cat extends Animal implements  AnimalInterface {

    public Cat(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(getName() + " eat whiskas");
    }

    public void makeSound() {
        System.out.println(getName() + " makes meow");
    }


}
