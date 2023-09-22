package com.octavian.operationsandcyclicfunctions;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int a = 5;

        //Incrementare
        a++;
        System.out.println("Valoarea după incrementare: " + a);

        //Incrementare prefixată
        ++a;
        int b = ++a;
        int a1 = a;
        int c = a++;
        System.out.println("Valoarea după incrementare prefixată: " + a);
        System.out.println("Afișează b= " + b + " a1= " + a1 + " c= " + c);

        //Decremetarea
        a--;
        System.out.println("Valoarea după decrementare: " + a);

        //Decremetarea prefixată
        --a;
        System.out.println("Valoarea după decrementare prefixată: " + a);



    }


}




