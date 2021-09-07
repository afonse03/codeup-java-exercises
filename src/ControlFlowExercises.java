// control statements and loops exercise

public class ControlFlowExercises {
    public static void main(String[] args) {
        //OJ's answer:
        int i = 2;
        do {
            System.out.println(i);
            i *= i; //squaring a number in java can be done by multiplying the number by itself or you can use Math.pow() function
        } while (i <= 10000); {
            System.out.println(i);
        }
    }
}

/*todo: Loop Basics - do while: 1. create a do while loop that will count by 2's starting with 0 and ending at 100 (follow each number with a new line)
                                2. alter your loop to count backwards by 5's from 100 to -10
                                3. create a do while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000
 */
