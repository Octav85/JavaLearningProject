package com.octavian.exceptionsservicetask;

public class TextManager {
    public static int getTextLength(String inputString) {
//        int stringLength = inputString.length();
        return inputString.length();
    }

    public static int getTextLengthWithTryCatchFinally(String inputString) {
        try {
            return inputString.length();
        } catch (NullPointerException captureExceptionInTryBlock) {
            System.out.println("An exception has captured with following message " + captureExceptionInTryBlock.getMessage());
            return 0;
        } finally {
            System.out.println("Acest cod va fi executat indiferent de faptul daca a fost sau nu o exceptie ");
        }
    }



        public static int getTheTextLengthWithIfElse(String inputString){
            if (inputString == null) {
                System.out.println("Null text");
                return 0;
            } else {
                System.out.println("Not null text");
                return inputString.length();
            }
        }
    }




