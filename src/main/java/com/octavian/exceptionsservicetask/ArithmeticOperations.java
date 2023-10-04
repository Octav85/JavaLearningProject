package com.octavian.exceptionsservicetask;

public class ArithmeticOperations {
    public static int divideIntNoExceptionHandling(int a, int b) {
        return a / b;
    }

    public static int divideIntWithExceptionHandling(int a, int b) {
        try{
            int result = a / b;
            return result;
        } catch (Exception capturedException){
            System.out.println("An exception has occurred" + capturedException.getMessage() );
            return 0;
        } finally {
            System.out.println("This is always printed, because it's a part of finally");
        }

        }
    }

