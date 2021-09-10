import java.util.Scanner;
public class MethodsExercises {
    // todo: basic arithmetic
    public static void main(String[] args) {
        System.out.println(getAddition(10, 10));
        System.out.println(getSubtraction(20, 10));
        System.out.println(getMultiplication(10, 10));
        System.out.println(getDivision(10, 2));
        System.out.println(getModulus(10, 6));
        System.out.println(getInteger(3, 5));

    }

    public static int getAddition(int x, int y) {
        return x + y;
    }

    public static int getSubtraction(int x, int y) {
        return x - y;
    }

    public static int getMultiplication(int x, int y) {
        return x * y;
    }

    public static int getDivision(int x, int y) {
        return x / y;
    }

    public static int getModulus(int x, int y) {
        return x % y;
    }
    // todo: create a method that validates that user input is in a certain range (STILL WORKING ON IT)

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if (userInput < min || userInput > max) {
            return getInteger(min, max);
        } else {
            return userInput;
        }
    }

    // todo: calculate the factorial of a number

//    public static int factorial(int n) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10: ");
//        int input = scanner.nextInt();
//        return input;
//
//        if (input = 1; input <= 10; input++) {
//            return input * input;
//        }
//    }
}
