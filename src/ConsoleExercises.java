import java.util.Scanner;

public class ConsoleExercises { // class definition
    public static void main(String[] args) {
        String name = "Panda";
        System.out.printf("Hello there, %s. Nice to see you. \n", name); // the %s will be replaced with the value of the name variable

        // multiple placeholders
        String greeting = "Salutations";
        String name2 = "Panda";
        System.out.printf("%s, %s! ", greeting, name2);

        Scanner scanner = new Scanner(System.in); // declare a variable of type Scanner, and assign a new Scanner object; System.in is specified for the source of the scanner

        System.out.println("");
        System.out.println("");
        System.out.println("Enter something: "); // prompt user
        String userInput = scanner.next(); // scanner.next() obtains the value the user entered as a String and store in userInput variable

        System.out.println("You entered: --> \"" + userInput + "\" <--"); // print out value the user entered; the printed value is considered a token

        // console io exercises
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.", pi);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("Enter an integer: ");
        int userInput2 = scanner2.nextInt();
        System.out.println("You entered: --> \"" + userInput2 + "\" <--");

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("Enter three words: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.printf("You entered: %n%s%n%s%n%s%n", firstWord, secondWord, thirdWord);
    }
}
