import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises { //class
    public static Scanner sc = new Scanner(System.in);

    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newArray = Arrays.copyOf(people, people.length + 1);
        newArray[people.length] = newPerson;
        System.out.println();
        return newArray;
    }

    public static void main(String[] args) { //method
        Person[] people = new Person[3]; //an array that holds 3 Person objects

        people[0] = new Person("Amanda"); //each element is assigned a new instance of the Person class
        people[1] = new Person("Gilbert");
        people[2] = new Person("Comet");

//        System.out.println(Person[0]);
//        System.out.println(Person[1]);
//        System.out.println(Person[2]);

        for (Person person : people) {
            System.out.println(person.getName());
        }
        System.out.println("Enter a person's name: ");
        Person newPerson = new Person(sc.nextLine());
        people = addPerson(people, newPerson);
        System.out.println("New list: ");
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }

}
