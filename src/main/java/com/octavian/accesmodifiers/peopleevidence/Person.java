package com.octavian.accesmodifiers.peopleevidence;

public class Person {

    public static boolean isHuman;
    private final long id;
    public String name;
    public String gender;
    public String surname;
    protected String address;
    public boolean isMarried;
    public boolean isRetired;


    public Person(String name, String inputSurname, long inputId) {
        this.id = inputId;
        this.name = name;
        this.surname = inputSurname;

        System.out.println("Un obiect de tip Person a fost creat, folosind un constructor cu 3 parametri formali");
    }

    public Person (long id, String gender, String address, boolean isMarried, boolean isRetired,String name, String inputSurname) {
        this.id = id;
        this.gender = gender;
        this.address = address;
        this.isMarried = isMarried;
        this.isRetired = isRetired;
        this.name = name;
        this.surname = inputSurname;
        System.out.println("Un obiect de tip Person a fost creat, folosind un constructor cu toți parametri formali");


    }


    }


