// todo: create person class inside of src that has a private name property that is a string
// todo notes: The class should have a constructor that accepts a `String` value and sets the person's name to the passed string. Create a `main` method on the class that creates a new `Person` object and tests the above methods.

import java.util.Scanner;
public class Person {
    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String userInput = scanner.next();
//        Person personName = new Person();

        System.out.println("Nice to meet you " + userInput + "!");
    }

    private String name;
    
    public String getName() {
// todo: return the person's name
        return name;
    }

    public void setName(String name) {
// todo: change the name property to the passed value
        this.name = name;
    }

    public void sayHello() {
// todo: print a message to the console using the person's name
        System.out.println(name);
    }
}

/*
package arrayslecture;

public class Person {

    private String name;
    private int age;

    public static void progressOneYear(Person[] people) {
        for (Person person : people) {
            person.setAge(person.getAge() + 1);
        }
    }

    public static void printOutAgesOfPeople(Person[] people) {
        for (Person person : people) {
            System.out.println(person.getAge());
        }
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
 */
