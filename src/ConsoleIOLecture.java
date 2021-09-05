import java.util.Scanner;

public class ConsoleIOLecture {

    public static void main(String[] args) {
//        String myString = "I am a string";
//        System.out.println(myString);

       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int userInput = scanner.nextInt();
        System.out.printf("You entered %d%n, userInput");



    }
}
/**
 * # Console IO Bonus Exercises
 *
 * 1. Prompt the user to enter a favorite quote
 *     - output the quote
 *     - ask them to enter how many words are in the quote
 *     - output the number they entered
 *     - output if the number they entered indeed matched the number of words
 *
 * 2. Prompt the user to enter a list of top three favorite foods separated by only spaces
 *
 *     - Use the printf() to output the three top foods with the format:
 *         1. FirstFood
 *         2. SecondFood
 *         3. ThirdFood
 *
 * 3. Prompt the user to enter a grocery list of three items
 *     - each item should only be separated by a comma (no spaces)
 *     - you will need to use the .useDelimiter() method on your scanner object
 *     - output the result as a comma-separated list using printf()
 */
