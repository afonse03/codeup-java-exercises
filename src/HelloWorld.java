//introduction to java exercise (9/2/21)
/*todo: create a program that outputs "Hello, World!" to the console.
  todo: try renaming the main method. What happens when we try to run it? IT WONT RUN
  todo: refactor your code to use two system.out.print statements without changing the output
 */
// the out directory is where IntelliJ puts the compiled Java files, to keep them separate from the source code
// system.out.println is used to output information to the console with a newline
// system.out.print can be used to output information without a newline


public class HelloWorld {
    public static void main(String[] args) { //main HAS to be there or it won't run
        System.out.println("Hello, World!");
        System.out.println("Hello again, World!"); //this output is right next to the one above when I add a second System.out.print statement. if both statements are system.out.println then the outputs are on their own line
    }
}
