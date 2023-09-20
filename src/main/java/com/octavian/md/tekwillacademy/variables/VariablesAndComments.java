package md.tekwillacademy.variables;

public class VariablesAndComments {
    public static void main(String[] args) {
//        Declare the variables

        boolean isUsed;
        boolean hasBattery;
        boolean IsAndroid;
        boolean isStolen;
        boolean isBlocked;
        boolean isCharged;
//        Char related

        char condition;
//     Numeric related

        byte numbersOfSimCards;
        byte randomAccessMemory;
        short productionYear;
        int numbersOfOwners;
        long id;
        float operatingSystemVersion;
        double price;

//        Initialize an Iphone

        isUsed = false;
        hasBattery = true;
        isStolen = false;
        isBlocked = true;
        isCharged = true;

        condition = 'A';

        numbersOfSimCards = 2;
        randomAccessMemory = 4;
        productionYear = 2023;
        numbersOfOwners = 0;
        id = 5678778711L;
        operatingSystemVersion = 16.16F;
        price = 3455521.5F;


        System.out.println("The phone is charged " + isCharged);
        System.out.println("The phone price is " + price);

    }
}
