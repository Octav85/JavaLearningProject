package classesandobjects.autoservicetask.autoservicetask;

public class Tool {

    public double price;
    public double weight;
    public String name;
    public long uniqueCod;


    public Tool(String name) {
        this.name = name;
        System.out.println("Un nou obiect de tip Tool a fost creat, numele lui este: " + this.name);

    }

    public Tool(){


    }

}

