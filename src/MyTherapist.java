// lecture warmup on 9/8/21
// todo: create a class called MyTherapist and it should ask you how you are doing today. Based on your response, it should give you some sort of advice

import java.util.Scanner;
public class MyTherapist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hi Amanda! I'm your virtual therapist. On a scale of 1-10, 10 being great, how are you doing today?");
        System.out.println(" ");
        int userResponseToTherapist = Integer.parseInt(String.valueOf(scanner.nextInt()));
        for (int i = 1; i <= userResponseToTherapist; i++) {
        }
        System.out.println("Thanks for letting me know!");
    }
}
