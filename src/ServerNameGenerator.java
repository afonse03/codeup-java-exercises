import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ServerNameGenerator {

//    public static Scanner scanner = new Scanner(System.in);
//    public static String[] adjectives

    public static String[] adjectives = {
            "Beautiful",
            "Bad",
            "Calm",
            "Bored",
            "Crazy",
            "Disgusted",
            "Delightful",
            "Curious",
            "Cute",
            "Disturbed"
    };

    public static String[] nouns = {
            "Answer",
            "Color",
            "Disease",
            "Knowledge",
            "Discovery",
            "Food",
            "Jelly",
            "Join",
            "Advertisement",
            "Comfort"
    };

    public static String wordGenerator() {
        Random generator = new Random();
        int randomAdjective = generator.nextInt(adjectives.length);
        int randomNoun = generator.nextInt(nouns.length);
        return adjectives[randomAdjective];

    public static void main(String[] args) {
            System.out.println(wordGenerator());
        }


//    public static void main(String[] args) {
//        Adjective[] adjectives = {
//        new Adjective("Beautiful");
//        new Adjective("Bad");
//        new Adjective("Calm");
//        new Adjective("Bored");
//        new Adjective("Crazy");
//        new Adjective("Disgusted");
//        new Adjective("Delightful");
//        new Adjective("Curious");
//        new Adjective("Cute");
//        new Adjective("Disturbed");
//        }
    }
}
