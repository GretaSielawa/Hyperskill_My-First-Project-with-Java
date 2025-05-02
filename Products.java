package calculator;


public class Products {


    public String name;
    public double price;
    int earnings = 0;

    public Products (String name, double price, int earnings) {
        this.name = name;
        this.price = price;
        this.earnings = earnings;
    }

    public String toString() {
        return name + ": $" + earnings;
    }




}
