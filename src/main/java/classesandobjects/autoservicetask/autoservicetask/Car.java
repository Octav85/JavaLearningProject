package classesandobjects.autoservicetask.autoservicetask;

public class Car {
    public int km;
    public String gearType;
    public String name;
    public String model;
    public int year;
    public double carPrice;
    public String fuelType;
    public String color;
    public String plateNumber;

    public Car(String nameParametruDeIntrare, String modelDeIntrare, int year, String colorLocalVariable) {
        this.name = nameParametruDeIntrare;
        this.model = modelDeIntrare;
        this.year = year;
        this.color = colorLocalVariable;
    }
    public Car(String plateNumber){
        this.plateNumber = plateNumber;





    }


}



