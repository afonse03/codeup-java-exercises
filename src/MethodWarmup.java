/*
lecture warmup on 9/9/21
todo: create a class, MethodWarmup, and add an empty main method
todo: create a method, getDifference, that takes in two integers and returns the difference between the higher integer and the lower integer (subtract)
    - if both integers are equal, the order of operands doesn't matter in the calculation
    - if only one integer is passed, treat the calculation as if zero was passed as the second argument
    - BONUS: allow the method to accept two doubles and return a double output
 */

public class MethodWarmup {
    public static double getDifference(int x, int y) {
        if (y > x) return y - x;

        return x - y;
    }
    public static void main(String[] args) {
        System.out.println(getDifference(50, 70));

    }
}
