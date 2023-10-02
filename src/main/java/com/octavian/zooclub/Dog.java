package com.octavian.zooclub;

public class Dog extends Animal implements AnimalInterface {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " eats pedigree");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes woof");
    }





}
