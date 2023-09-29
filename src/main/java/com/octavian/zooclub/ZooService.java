package com.octavian.zooclub;

import java.util.HashMap;

public class ZooService {
    public static void main(String[] args) {
        Animal SobakenDog = new Dog("Sobaken");
        Cat ham = new Cat("ham");
        AnimalInterface cuciuDog = new Dog("Cuciu");

        System.out.println("numele obiectului este: " + SobakenDog.getName());
        SobakenDog.setName("Sobaken goodboy");
        System.out.println("numele actualizat al câinelui este: " + SobakenDog.getName());
        SobakenDog.eat();
        cuciuDog.makeSound();
        ham.eat();
        ham.makeSound();


    }
}
