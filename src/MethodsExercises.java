import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class MethodsExercises {
    // todo: basic arithmetic
    public static void main(String[] args) {
        System.out.println(getAddition(10, 10));
        System.out.println(getSubtraction(20, 10));
        System.out.println(getMultiplication(10, 10));
        System.out.println(getDivision(10, 2));
        System.out.println(getModulus(10, 6));
        System.out.println(getInteger(3, 5));
        diceRoll();
    }

    public static void diceRoll(int sides, int numberOfDice) {
        for (int i = 1; i <= numberOfDice; i++) {
            int result = (int) Math.floor(Math.random() * ((sides - 1) + 1) + 1);
            System.out.println(result);
        }
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

    // todo: calculate the factorial of a number (STILL WORKING ON IT)

//    public static long factorial(int x) {
//        // a method that calls itself over and over again until you get what you want
//        // base case:  when do you want to stop?
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10: ");
//        if (x == 1) return 1;
//        return x * factorial(x - 1);
////        int input = scanner.nextInt();
////        return input;
////
////        if (input = 1; input <= 10; input++) {
////            return input * input;
////        }
//    }

    // todo: create an application that simulates dice rolling

    public static void diceRoll() {
        boolean keepGoing = true;
        while (keepGoing) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of sides for a pair of dice.");
            int sides = sc.nextInt();
            System.out.println("How many die are you wanting to roll?");
            int numDice = sc.nextInt();
            diceRoll(sides, numDice);
            sc.nextLine();
            String answer = " ";
            while (!answer.equalsIgnoreCase("Yes") && !answer.equalsIgnoreCase("No")) {
                System.out.println("Keep playing? [Yes/No]");
                answer = sc.nextLine();
            }
            if (answer.equalsIgnoreCase("No")) {
                System.out.println("Thanks for playing!");
                keepGoing = false;
            }
        }
    }
}
