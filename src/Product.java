// mini exercise from lecture on 9/13/21
// goes with producttest.java file
public class Product {
    /* TODO: create a class called Product with two private properties of name and priceInCents.
    Add a public static method called, findAveragePrice, that takes in an array of products
    and finds the average price of all products. Add a main method to the class to test some
    values.

    control - return = intellij automatically creates the boilerplate layout for you
 */

    // private variables
    private String name;
    private double priceInCents;

    // constructor
    public Product(String name, double priceInCents) { //put this after the variables
        this.name = name;
        this.priceInCents = priceInCents;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public double getPriceInCents() {
        return priceInCents;
    }

}
