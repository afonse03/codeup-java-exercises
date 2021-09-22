//lecture warmup on 9/13/21
// todo: create a class called MyMathMethods. create a method in there called multiply. have it take two integer parameters and return the product of the two integers. do not create a main method in your class. create a test class, and run your multiply method from a main method in your test class. bonus: you can overload the method with a version that takes doubles instead of ints as its parameters. another bonus: refactor so the multiply method is static, then refactor your test so as to use the static method. another bonus: get input from user


public class MyMathMethods {
//    public static int multiply(int x, int y) {
//        return x * y;
//    }

    // warmup on 9/22/21
    // 1. use method overloading to create a public static multiply method that works with doubles
    public static double multiply(double x, double y) {
        return x * y;
    }

    // 2. write a public static method named quotient that works with both integers and doubles (use mthod overloading) and returns the result of dividing the two passed numbers.
//    public static int quotient(int x, double y) {
//        return (int) (x / y);
//    }

    public static int quotient(int x, int y) {
        return x / y;
    }

    public static double quotient(double x, double y) {
        return x / y;
    }
    // 3. write a public static method named arraySum that takes in an array of int numbers (not a list, an array), and returns the sum of the numbers
    public static int arraySum(int[] myNumArray) {
        int sum = 0;
        for (int i = 0; i < myNumArray.length; i++) {
            sum += myNumArray[i];
        }
        return sum;
    }

    // 4: create a class called Movie. The class should define two instance variables of type String named name and director. Add a constructor that takes two strings and sets the name and director properties based on the passed arguments. Make it so the instance variables are not accessible from outside the Movie class. Write getters and setters for the instance variables.

    // BONUS: if the passed name or director arguments are null or empty, the constructor should throw an IllegalArgumentException

}