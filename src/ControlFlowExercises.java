// control statements and loops exercise

public class ControlFlowExercises {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) { // is it a multiple of 3 & 5?
                System.out.println("FizzBuzz");
            } else if ((i % 3) == 0) { // is it a multiple of 3?
                System.out.println("Fizz");
            } else if ((i % 5) == 0) { // is it a multiple of 5?
                System.out.println("Buzz");
            } else System.out.println(i); // not a multiple of either 3 or 5
        }
    }
}

//source: https://howtodoinjava.com/java/puzzles/fizzbuzz-solution-java/

/*todo: Fizzbuzz - 1. write a program that prints the numbers from 1 to 100
                   2. for multiples of three: print "fizz" instead of the number
                   3. for the multiples of five: print "buzz"
                   4. for numbers which are multiples of both three and five: print "FizzBuzz"
 */
