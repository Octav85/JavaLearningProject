package com.octavian.operationsandcyclicfunctions;

public class AritmeticOperationsExample {
    public static void main(String[] args) {
        int a = 42;
        double c = 3;

        //Sum
        double sum = a + c;
        System.out.println("Suma este :" + sum);
        System.out.println("Suma este:" + (a + c));

        //Subtraction
        double sub = a - c;
        System.out.println("Rezultatul: " + sub);

        //Multiplication
        double result = a * c;
        System.out.println("Înmulțirea:" + result);

        //Division
        result = a / c;
        System.out.println("Împărțirea: " + result);
        result = c/a;
        System.out.println(" Rezultatul este" + result);
        System.out.println("pentru a obține un rezultat cu zecimale, este necesar ca deîmpărțitul să fie de tip float/double.");



    }
}
