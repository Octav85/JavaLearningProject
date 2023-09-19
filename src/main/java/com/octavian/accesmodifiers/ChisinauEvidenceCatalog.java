package com.octavian.accesmodifiers;


import com.octavian.accesmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {


        Person ionPerson = new Person("Ion", "Munteanu", 20022212221L);
        System.out.println("Numele noului cetățean este: " + ionPerson.name + " " + ionPerson.surname);


        Person mariaPerson = new Person(321131444L, "Feminin", "Voluntarilor 15", true, false, "Maria", "Mirabela");
        System.out.println("Numele noii persoane în catalogul pentru compensații este: " + mariaPerson.surname + " " + mariaPerson.surname);

        mariaPerson.isRetired = false;
        if (mariaPerson.isRetired) {
            System.out.println("Maria este pensionară");
        } else {
            System.out.println("Maria este aptă de muncă");
        }

        Person janaPerson = new Person(321131444L, "Feminin", "Balti 15", true, true, "Jana", "Aguzarova");
        if (janaPerson.isMarried) {
            System.out.println("Jana este căsătorită");

        } else {
            System.out.println("Jana nu este căsătorită");
        }

        Person joraPerson = new Person(3211312714L, "Bărbat", "Cahul 15", true, false, "Jora", "Cardan");
        if (mariaPerson.isRetired) {
            System.out.println("Jora este în floarea vârstei");
        } else {
            System.out.println("Jora e la pensie");
        }

        Person willPerson = new Person("Will", "Smith", 20022212221L);
        System.out.println("Numele ultimului om de pe acest pământ este: " + willPerson.name + " " + willPerson.surname);
        System.out.println("Suntem noi oameni după asta ? " + Person.isHuman);
    }


}

