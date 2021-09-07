import java.util.Scanner;

public class ControlStatementsAndLoops {
    public static void main(String[] args) {
        // You can solve any programming problem with just
        // Statements
        // Decisions
        // Loops

        // You can:
        // Do something
        // Do something under a certain condition
        // Do something again and again

        // Key differences about Java statements with respect to JavaScript statements:
        // no Automatic Semicolon Insertion
        // all variables need a type declaration

        // Conditional branching
//        int x = 5;
//        if (x == 5) {
//            System.out.println("If you are reading this, x must be 5 since this is running");
//        }
//        System.out.println("On the other hand, this doesn't mean anything because it runs regardless of what x is");

//        int y = 2;
//        y = 3;
//        if (y == 2) {
//            System.out.println("I've carried out a conditional test and I can confirm that the statement 'y == 2' is true");
//        } else {
//            System.out.println("The result of my conditional test was false");
//        }

//        System.out.println(y==2);

//        short y = -5;
//        y = 12;
//        y = 32450;
////         y = 33000; //incompatible types: possible lossy conversion from int to short
//
//        if (y < 0 ) {
//            System.out.println("The variable y contains a negative number");
//        } else if (y >=0 && y < 30000){
//            System.out.println("The variable y contains a positive number");
//        } else {
//            System.out.println("The variable y is dangerously close to the max value for short type variables, which is " + Short.MAX_VALUE);
//        }

//        String customerChoice = "strawberry";
//
//        switch (customerChoice) {
//            case "vanilla":
//                System.out.println("One vanilla coming right up");
//                break;
//            case "chocolate":
//                System.out.println("chocolate coming right up");
//                break;
//            case "strawberry":
//                System.out.println("strawberry coming right up");
//                break;
//            default:
//                System.out.println("We don't have that");
//                break;
//        }
//
////        short circuit vs non short circuit operator
//        int c = 0, d = 100, e = 50;
//        if (c == 0 && e++ < 100) {
//            d = 150;
//        }
//        System.out.println("e = " + e);

//        int number = 42;
//        boolean existence = true;
//
//        if (existence || number++ == 42) { // || is an OR operator
//
//        }
//        System.out.println(number);

        // NOTES:
        // no === operator, only ==
        // don't confuse the variable assignment operator =
        // with the comparison operator ==
        // inequality operator: != (there is no strict in equality operator

        /*
        Mini-exercise from lecture on 9/7/21:
        todo: write a java program that asks the user for their age and then tells them if they are a teenager or not
        todo: (BONUS) if not, tell them whether they are younger or older than a teenager
         */


        // started loops on 9/7/21

//        int i = 1;
//        System.out.println("The loop hasn't started yet. The value of i is " + i);
//        while (i < 10){
//            System.out.println("Now I'm in the loop. i has not incremented yet and its value is " + i);
//            i = i + 1;
//            System.out.println("I'm still in the loop. i has incremented now and its value is " + i);
//        }
//        System.out.println("22222This is out the far end of the loop. The conditional has tested false. The value of i is what it last incremented to. See? " + i);
//
//        int i = 1;
//        System.out.println("The loop hasn't started yet. The value of i is " + i);
//        do {
//            System.out.println("Now I'm in the loop. i has not incremented yet and its value is " + i);
//            i = i + 1;
//            System.out.println("I'm still in the loop. i has incremented now and its value is " + i);
//        } while (i<10);
//        System.out.println("This is out the far end of the loop. The conditional has tested false. The value of i is what it last incremented to. See? " + i);

//        int i;
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Now I'm in the loop. i has not incremented yet and its value is " + i);
//        }
//        System.out.println("This is out the far end of the loop. The conditional has tested false. The value of i is what it last incremented to. See? " + i);



//        int numberOfCansOfBigRedOnTheWall = 99;
//        String word = "cans";
//        while (numberOfCansOfBigRedOnTheWall > 0) {
//            System.out.println(numberOfCansOfBigRedOnTheWall + " " + word + " of Big Red on the wall");
//            System.out.println(numberOfCansOfBigRedOnTheWall + " " + word + " of Big Red");
//            System.out.println("Take one down, pass it around");
//            numberOfCansOfBigRedOnTheWall--;
//            if (numberOfCansOfBigRedOnTheWall == 1) {
//               word = "can";
//            }
//            if (numberOfCansOfBigRedOnTheWall == 0) {
//                System.out.println("No more cans of Big Red on the wall");
//            } else {
//                System.out.println(numberOfCansOfBigRedOnTheWall + " " + word + " of Big Red on the wall");
//            }
//        }
    }
}