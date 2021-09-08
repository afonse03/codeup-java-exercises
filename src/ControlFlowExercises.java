// control statements and loops exercise
import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter an integer: ");
       int userInteger = Integer.parseInt(String.valueOf(scanner.nextInt()));
        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
//        System.out.printf("number");
//        System.out.printf(" | ");
//        System.out.printf("squared");
//        System.out.printf(" | ");
//        System.out.printf("cubed");
        for (int i = 1; i <= userInteger; i++) {
            System.out.printf("%-7d| %-8d| %-5d%n", i, i*i, i*i*i);
        }
        System.out.println(" ");
        System.out.println("Do you want to continue?");
    }
}


/*todo: display a table of powers - 1. prompt the user to enter an integer
                                    2. display a table of squares and cubes from 1 to the value entered
                                    3. ask if the user wants to continue
                                    4. assume that the user will enter valid data
                                    5. only continue if the user agrees to
 */
