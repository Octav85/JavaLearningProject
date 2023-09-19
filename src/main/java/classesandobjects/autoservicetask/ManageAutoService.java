package classesandobjects.autoservicetask;

import classesandobjects.autoservicetask.autoservicetask.*;

public class ManageAutoService {
    public static void main(String[] args) {
        Garage garajulLuiOctavian = new Garage();
        garajulLuiOctavian.address = "Hristo Botev 21";
        garajulLuiOctavian.surfaceM2 = 245.55F;
        garajulLuiOctavian.capacity = 50;

        System.out.println("Garajul lui Octavian are următoarele proprietăți: Adresa: " + garajulLuiOctavian.address + ", Capaci" +
                "tatea:" + garajulLuiOctavian.capacity + ", Suprafața de: " + garajulLuiOctavian.surfaceM2 + " metri pătrați.");

        Car masinaLuiOctavian = new Car("Honda", "Civic", 2000, "Neagră");
        masinaLuiOctavian.fuelType = "benzină";
        masinaLuiOctavian.gearType = "cutie manuală";

        Car plateNumber = new Car("DVD113");


        System.out.println("Mașina lui Octavian este " + masinaLuiOctavian.name + " " + masinaLuiOctavian.model + " producția anului " +
                masinaLuiOctavian.year + ", de culoarea " + masinaLuiOctavian.color);
        System.out.println("Mașina are cutia de viteze " + masinaLuiOctavian.gearType + ", tipul de motorizare este " +
                masinaLuiOctavian.fuelType);
        System.out.println("Numărul plăcii este " + plateNumber.plateNumber);


        Tool testerTool = new Tool("Tester baterie");
        testerTool.price = 15.0F;
        testerTool.uniqueCod = 2566488L;
        testerTool.weight = 1.85;
        System.out.println("Un nou instrument a fost adăugat în Autoservice. " + "Nume Intrument: " + testerTool.name +
                " Greutatea: " + testerTool.weight + " kg" + " Cod numeric unic: " + testerTool.uniqueCod);

        Tool ciocanTool = new Tool();
        ciocanTool.name = "Ciocan";
        ciocanTool.weight = 1.60;
        System.out.println("A fost creat un nou intrument, la moment cunoaștem doar numele: " + ciocanTool.name +
                " și greutatea " + ciocanTool.weight);


        Worker ionWorker = new Worker();
        ionWorker.name = " Ion Ciocanu";
        ionWorker.age = 35;
        ionWorker.isExperienced = true;
        ionWorker.specialization = "Electronics";

        System.out.println("A fost angajat un lucrător nou, numele lui este " + ionWorker.name + ", Vârsta: " +
                ionWorker.age + " ani. Este specializat în " + ionWorker.specialization + ". Experiență în domeniu: " +
                ionWorker.isExperienced);


        Person clientPerson = new Person("+3736918516");
        clientPerson.name = "Very Important";

        System.out.println("Numele celui mai important client este:" + clientPerson.name + ". Numărul de contact este:" +
                clientPerson.phoneNumber);


    }
}