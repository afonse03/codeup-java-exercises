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
  todo: create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console
  todo: create a string variable named myString and assign a string value to it, then print the variable out to the console
  todo: change your code to assign a character value to myString. What do you notice?
  todo: change your code to assign the value 3.14159 to myString. What happens?
  todo: declare a long variable named myNumber, but do not assign anything to it. Next, try to print out myNumber to the console. What happens?
  todo: change your code to assign the value 3.14 to myNumber. What do you notice?
  todo: change your code to assign the value 123L to myNumber
 */




        int myFavoriteNumber = 10; //how do I print this to the console? System.out.print();
//        console.log(myFavoriteNumber);
        System.out.println(myFavoriteNumber);

        String myString = "amanda";
        System.out.println(myString);

//        String myString = 'a'; //I received an incompatible types error in the console
//        System.out.println(myString);

        // this is how you reassign the above code
        String myString2 = myString;
        System.out.println(myString);

//        int myString = 3.14159; //I received an incompatible types error in the console
        System.out.println(myString);

        //s o u t, tab and it automatically pulls out the console.log

//        float myNumber = 314.0; //I received a variable myNumber might not have been initialized error in the console
//        System.out.println(myNumber);

//        long myNumber = 3.14; //I received an incompatible types error in the console
//        System.out.println(myNumber);


    }
}

