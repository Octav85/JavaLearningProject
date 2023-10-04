package com.octavian.exceptionsservicetask;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String controlVariable= null;

        System.out.println("The string length is: "+ TextManager.getTextLengthWithTryCatchFinally(controlVariable));
        System.out.println("The string length is: "+TextManager.getTheTextLengthWithIfElse(controlVariable));

        int result = ArithmeticOperations.divideIntWithExceptionHandling(5, 0);
        System.out.println(result);
        System.out.println("The program is running till the end");







    }
}
