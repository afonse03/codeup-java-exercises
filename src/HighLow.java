//import java.util.Scanner;
//public class HighLow {
//    public static void main (String[] args) {
//        randomNum();
//    }
//    public static void randomNum () {
//        boolean keepGoing = true;
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Guess a number between 1 and 100: ");
//            int result = (int)Math.floor(Math.random() * 100 + 1);
//        System.out.println(result); // use this to figure out what the random number is generated by the computer
//            while (keepGoing) {
//                int userGuess = sc.nextInt();
//                if (userGuess == result) {
//                    System.out.println("Good guess!");
//                    keepGoing = false;
//                } else if (userGuess < result) {
//                    System.out.println("HIGHER");
//                } else if (userGuess > result) {
//                    System.out.println("LOWER");
//                }
//            }
//        }
//    }

//int stringTest = "";
