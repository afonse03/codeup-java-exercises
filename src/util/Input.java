//package util;
//
//import java.util.Scanner;
//
//public class Input {
//    private Scanner scanner;
//
//    public String getString() {
//        System.out.println("Please enter a string: ");
//        String userInput = scanner.nextLine();
//        return userInput;
//    }
//
//    public String getString(String prompt) {
//        System.out.println(prompt);
//        String userInput = scanner.nextLine();
//        return userInput;
//    }
//
//    public boolean yesNo(String input) {
//        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
//    }
//
//    public boolean yesNo() {
//        System.out.println("Do you agree?");
//        String answer = scanner.next();
////        return answer.equalsIgnoreCase(("y") || answer.equalsIgnoreCase("yes");
//    }
//
//    public int getInt(int min, int max) {
//        int userInt;
//
//        do {
//            System.out.println("Please enter a number between " + min + " and " + max + "; ");
//            userInt = scanner.nextInt();
//        } while (userInt > max || userInt < min);
//        return userInt;
//    }
//
//    public int getInt() {
//        System.out.println("Please enter a number: ");
//        int userInt = scanner.nextInt();
//
//        return userInt;
//    }
//
//    public double getDouble(double min, double max) {
//        double userInt;
//
//        do {
//            System.out.println("Please enter a number between " + min + " and " + max + ": ");
//            userInt = scanner.nextDouble();
//        } while (userInt > max || userInt < min);
//
//        return userInt;
//    }
//
//    public double getDouble() {
//        System.out.println("Please enter a decimal number: ");
//        double userDbl;
//        try {
//            userDbl = Double.parseDouble(getString("Enter number here: "));
////            userDbl = Double.valueOf(getString("Enter number here: "))
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("This is not a number.");
//            return getDouble();
//        }
//        return userDbl;
//    }
//
//    // When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class
//    public Input() {
//        this.scanner = new Scanner(System.in);
//    }
//}
