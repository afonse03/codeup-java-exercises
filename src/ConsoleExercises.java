public class ConsoleExercises {
    public static void main(String[] args) {
        String name = "Panda";
        System.out.printf("Hello there, %s. Nice to see you. \n", name); // the %s will be replaced with the value of the name variable

        // multiple placeholders
        String greeting = "Salutations";
        String name2 = "Panda";
        System.out.printf("%s, %s! ", greeting, name2);


        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.", pi);
    }
}
