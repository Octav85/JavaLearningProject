package com.octavian.operationsandcyclicfunctions;

public class ComparisonOperationsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        boolean isEqual = a == b;
        System.out.println( "Este egal " + isEqual);

        boolean isNotEqual = a != b;
        System.out.println("Diferit de " + isNotEqual);

        boolean isGreaterThan = a > b;
        System.out.println("Mai mare decat " + isGreaterThan);

        boolean isLessThan = a < b;
        System.out.println("Mai mic decat " + isLessThan);

        boolean isGreaterThanOrEqual = a >= b;
        System.out.println("Mai mare sau egal " + isGreaterThanOrEqual);
    }
}
