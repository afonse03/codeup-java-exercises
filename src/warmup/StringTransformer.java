// warmup on 9/17/21
/*
================================= WARM UP
Create an abstract class, StringTransformer: DONE
  - add a protected string variable called ‘str’
  - add a constructor to set the variable
  - add public add getters and setters for this variable
  - add an abstract method called ‘transform()’ that returns a string

Create a subclass, UpperCaseStringTransformer, that extends StringTransformer:
  - define a constructor that accepts a string and sets the str variable to that value using the parent constructor
  - override the transform method to return an output of the string in all uppercase

Create a subclass, ReverseStringTransformer, that extends StringTransformer:
  - define a constructor that accepts a string and sets the str variable to that value using the parent constructor
  - override the transform method to return an output of the characters of the ‘str’ property in reverse order

Create a class, StringTransformerTest, with a main method: For the last part of the warm up, you will need to add both StringTransformer objects to an array before using a loop to print out the return value of the transform method.
  - add a main method to create a instances of both subclasses of the parent type with test strings
  - use a loop to print out the transformed versions of the strings


  CONTROL - RETURN: brings up the menu I need

 */
package warmup;

import org.w3c.dom.ls.LSOutput;

abstract class StringTransformer {
    protected String str; // a protected string variable called ‘str’

    // a constructor to set the variable
    public StringTransformer(String str) {
        //System.out.println("I'm a string transformer");
        this.str = str;
    }

    // public getter for this variable
    public String getStr() {
        return str;
    }

    // public setter for this variable
    public void setStr(String str) {
        this.str = str;
    }

    public StringTransformer() {

    }

    // an abstract method called ‘transform()’ that returns a string
    abstract String transform();

}
