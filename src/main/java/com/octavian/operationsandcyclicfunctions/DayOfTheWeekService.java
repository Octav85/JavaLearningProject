package com.octavian.operationsandcyclicfunctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {
        int numberOfDay;
        String dayName = "joi";

        switch (dayName) {
            case "luni":
                numberOfDay = 1;
                break;
            case "marti":
                numberOfDay = 2;
                break;
            case "miercuri":
                numberOfDay = 3;
                break;
            case "joi":
                numberOfDay = 4;
                break;
            case "vineri":
                numberOfDay = 5;
                break;
            case "sâmbata":
                numberOfDay = 6;
                break;
            case "duminica":
                numberOfDay = 7;
                break;
            default:
                numberOfDay = 0;
                System.out.println("nu este o zi valabilă");


        }
        System.out.println(" numarul zilei " + dayName.toUpperCase() + " este " + numberOfDay);
    }
}
