//introduction to java exercise (9/2/21)
/* To-Do for Intro to Java exercise:
  todo DONE: create a program that outputs "Hello, World!" to the console.
  todo DONE: try renaming the main method. What happens when we try to run it? IT WONT RUN
  todo DONE: refactor your code to use two system.out.print statements without changing the output
 */
// the out directory is where IntelliJ puts the compiled Java files, to keep them separate from the source code
// system.out.println is used to output information to the console with a new line
// system.out.print can be used to output information without a newline

public class HelloWorld { //this is a class definition
    public static void main(String[] args) { //main HAS to be there or it won't run; this is a method (or a function); every function is a method; args means arguments; the method can take an array of arguments
        System.out.println("Hello, World!");
        System.out.println("Hello again, World!"); //this output is right next to the one above when I add a second System.out.print statement. if both statements are system.out.println then the outputs are on their own line

/*====================================================================================================*/

/* To-Do for Syntax, Types, and Variables exercise:
  todo: create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console - done
  todo: create a string variable named myString and assign a string value to it, then print the variable out to the console - done
  todo: change your code to assign a character value to myString. What do you notice? - done
  todo: change your code to assign the value 3.14159 to myString. What happens? - done
  todo: declare a long variable named myNumber, but do not assign anything to it. Next, try to print out myNumber to the console. What happens? - done
  todo: change your code to assign the value 3.14 to myNumber. What do you notice?
  todo: change your code to assign the value 123L to myNumber - done
  todo: change your code to assign the value 123 to myNumber - done
  todo: change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this? - done
 */




        int myFavoriteNumber = 10; // how do I print this to the console? System.out.print();
//        console.log(myFavoriteNumber);
        System.out.println(myFavoriteNumber);

        String myString = "amanda";
        System.out.println(myString);

//        String myString = 'a'; // I received an incompatible types error in the console
//        System.out.println(myString);

        // this is how you reassign the above code
        String myString2 = myString;
        System.out.println(myString);

//        int myString = 3.14159; //I received an incompatible types error in the console
        System.out.println(myString);

        //s o u t, tab and it automatically pulls out the console.log

//        float myNumber = 314.0; //I received a variable myNumber might not have been initialized error in the console
//        System.out.println(myNumber);

//        long myNumber = 3.14; //I received an incompatible types error in the console because we need to assign double to it instead of long
//        System.out.println(myNumber);

//        long myNumber = 123L; // it printed out 123 in the console
//        System.out.print(myNumber);

//        long myNumber = 123; // it also printed out 123 in the console
//        System.out.print(myNumber);

//        double myNumber = 3.14; // this is how you correctly print out 3.14 to the console
//        System.out.print(myNumber);

//        float myNumber = 3.14; // incompatible types: possible lossy conversion from double to float error in the console
//        System.out.print(myNumber);

//        int x = 5;
//        System.out.println(x++); // 5
//        System.out.println(x); // 6

//        int x = 5;
//        System.out.println(++x); // 6
//        System.out.println(x); // 6

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o; // the error says class java.lang.String cannot be cast to class java.lang.Integer; casting is coercing a value of one type into another (implicit and explicit casting)

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three"; // the error says java.lang.String cannot be converted to int

        // todo: rewrite the following expressions using the relevant shorthand assignment operator: += & -= - done
        /*
         int x = 4;
         x = x + 5; */
//        int x = 4;
//        x += 5;
//        System.out.print(x); // 9

        /*
         int x = 3;
         int y = 4;
         y = y * x;
        */
//        int x = 3;
//        int y = 4;
//        x *= 4;
//        System.out.print(x); // 12

        /*
        int x = 10;
        int y = 2;
        x = x / y;
        y = y - x;
         */
//        int x = 10;
//        int y = 2;
//        x /= 2;
//        System.out.print(x); // 5
//        x -= 2;
//        System.out.print(x); // 8


    }
}

