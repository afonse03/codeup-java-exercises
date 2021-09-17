/*
Instructions: continued from warmup on 9/17/21

Create a subclass, ReverseStringTransformer, that extends StringTransformer:
  - define a constructor that accepts a string and sets the str variable to that value using the parent constructor
  - override the transform method to return an output of the characters of the ‘str’ property in reverse order
 */

package warmup;

public class ReverseStringTransformer extends StringTransformer{
    public class ReverseStringTransformer(String str) {
        setStr(str);
    }

    String transform() {
        return new StringBuilder(str).reverse().toString();
    }
}


