package com.octavian.operationsandcyclicfunctions;

public class GradeSystem {
    public static void main(String[] args) {
        int testResult = 76;

        if (testResult >= 90) {
            System.out.println("Calificativul A");

        } else if (testResult >= 80) {
            System.out.println("Calificativul este B");
        } else if (testResult >=70 ) {
            System.out.println("Calificativul este C");

        } else {
            System.out.println("Un astfel de calificativ nu este definit");
        }
        System.out.println("Programul s-a terminat");
    }
}
