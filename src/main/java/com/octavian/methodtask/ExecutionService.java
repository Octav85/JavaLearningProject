package com.octavian.methodtask;

public class ExecutionService {
    public static void main(String[] args) {
        int randomInt = DataGeneratorUtil.getRandomInt(10, 9999);
        System.out.println("Variabila este " + randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt(150);
        System.out.println("Variabila este " + randomInt1);

        double randomDouble = DataGeneratorUtil.getRandomDouble(1000.0);
        System.out.println("Variabila double " + randomDouble);

        double randomDouble1 = DataGeneratorUtil.getRandomDouble(-1000.0);
        System.out.println("Variabila double " + randomDouble1);



        System.out.println("random boolean " + DataGeneratorUtil.getRandomBoolean());

        System.out.println("Random mail 1 " + DataGeneratorUtil.getRandomEmail());

        System.out.println("Random mail 2 " + DataGeneratorUtil.getRandomEmail());

        System.out.println("Random valid strings de X char " + DataGeneratorUtil.generaterandomString(256));

        System.out.println("Random invalid strings de X char " + DataGeneratorUtil.generateInvalidRandomString(5));

        Customer ionConsumer = new Customer("Ion", 25, "ion@gmail.com");

        System.out.println("nume obiect " + ionConsumer.getName());
        System.out.println(" virsta " + ionConsumer.getAge());
        System.out.println(" email " + ionConsumer.getEmail());

        ionConsumer.setName("Ion Brotacel");
        ionConsumer.setAge(27);
        ionConsumer.setEmail("ionBrotacel@gmail.com");

        System.out.println("nume obiect " + ionConsumer.getName());

        System.out.println(" virsta " + ionConsumer.getAge());

        System.out.println(" email " + ionConsumer.getEmail());

        Customer randomDataCustomer = new Customer(DataGeneratorUtil.generaterandomString(12), DataGeneratorUtil.getRandomInt(102)
                , DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());

        randomDataCustomer.setName(DataGeneratorUtil.generaterandomString(15));
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(18,64));

        randomDataCustomer.setEmail(DataGeneratorUtil.getRandomEmail());
        System.out.println(randomDataCustomer.toString());

    }


}
