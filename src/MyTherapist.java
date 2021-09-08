// lecture warmup on 9/8/21
// todo: create a class called MyTherapist and it should ask you how you are doing today. Based on your response, it should give you some sort of advice

import java.util.Scanner;
public class MyTherapist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hi! I'm your virtual therapist. On a scale of 1-5, 5 being great, how are you doing today?");
        System.out.println(" ");
        int userResponseToTherapist = Integer.parseInt(String.valueOf(scanner.nextInt()));
        if (userResponseToTherapist == 1) {
            System.out.println("Oh no...let's work on it!");
        } else if (userResponseToTherapist == 2) {
            System.out.println("Ok let's talk more about it!");
        } else if (userResponseToTherapist == 3) {
            System.out.println("Ok not bad!");
        } else if (userResponseToTherapist == 4) {
            System.out.println("Awesome, you're doing great!");
        } else if (userResponseToTherapist == 5) {
            System.out.println("That's perfect!");
        } else {
            System.out.println("Oops, please answer between 1-5");
        }
    }
}
