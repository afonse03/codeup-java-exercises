// warmup on 10/14/21

import java.util.Arrays;
import java.util.List;

/**
  TODO: In `codeup-java-exercises`, create a class `JavaDrills`, with the following:
  Create a public static method, `flipOuterCase`, that takes in a string and returns the string
  with the case reversed for the first and last letters. Assume the input will be three or more characters long.
    Example inputs and expected outputs...
        System.out.println(flipOuterCase(“cat”)); // CaT
        System.out.println(flipOuterCase(“CaT”)); // cat
        System.out.println(flipOuterCase(“caT”)); // Cat
        System.out.println(flipOuterCase(“cAt”)); // CAT
 */
// source: https://stackoverflow.com/questions/1729778/how-can-i-invert-the-case-of-a-string-in-java
public class JavaDrills {
    public static String flipOuterCase(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            boolean firstAndLast = chars[i] == chars[0] || chars[i] == chars[chars.length - 1]; // this is how you select the first and last letter of the string
            if (Character.isUpperCase(c)) {
                if (firstAndLast) {
                    chars[i] = Character.toLowerCase(c);
                }
            } else if (Character.isLowerCase(c)) {
                if (firstAndLast) {
                    chars[i] = Character.toUpperCase(c);
                }
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(flipOuterCase("cat"));
        System.out.println(flipOuterCase("CaT"));
        System.out.println(flipOuterCase("caT"));
        System.out.println(flipOuterCase("cAt"));
        System.out.println(flipOuterCase("AmandA"));

        System.out.println(returnTotalDifference(Arrays.asList(10, 2, 3), Arrays.asList(1, 2, 3)));
        System.out.println(returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7)));
        System.out.println(returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7, 1)));

        System.out.println(flipInnerCase(“cat”)); // cAt
        System.out.println(flipInnerCase(“CaT”)); // CAT
        System.out.println(flipInnerCase(“caT”)); // cAT
        System.out.println(flipInnerCase(“codeup”)); // cODEUp
        System.out.println(flipInnerCase(“CoDeup”)); // COdEUp
    }

    // warmup on 10/15/21
    /**
     TODO: In `codeup-java-exercises`, in `JavaDrills`:
     Create a public static method, `returnTotalDifference`, that takes in two lists of integers and returns the difference between the sum of all integers in the first list minus the sum of all integers in the second list.
     returnTotalDifference(Arrays.asList(10, 2, 3), Arrays.asList(1, 2, 3)); // returns 9
     returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7)); // returns 3
     returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7, 1)); // returns 2
     */

    public static int returnTotalDifference(List<Integer> firstList, List<Integer> secondList) {
        int totalFirst = 0;
        int totalSecond = 0;
        for (int number : firstList) {
            totalFirst += number;
        }
        for (int number : secondList) {
            totalSecond += number;
        }
        return totalFirst - totalSecond;
    }

    // still in progress
    // warmup on 10/21/12
    /*
    TODO: In 'codeup-java-exercises', in 'JavaDrills' add the following:
     Create a public static method, `flipInnerCase`, that takes in a string and returns the string
     with the case of all letters reversed EXCEPT for the first and last letters. Assume the input will be three or more characters long.
    Example inputs and expected outputs...
      System.out.println(flipInnerCase(“cat”)); // cAt
      System.out.println(flipInnerCase(“CaT”)); // CAT
      System.out.println(flipInnerCase(“caT”)); // cAT
      System.out.println(flipInnerCase(“codeup”)); // cODEUp
      System.out.println(flipInnerCase(“CoDeup”)); // COdEUp
     */

    public static String flipInnerCase(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            boolean innerChar = chars[i] != chars[0] && chars[i] != chars[chars.length - 1];
            if (Character.isUpperCase(c)) {
                if (innerChar) {
                    chars[i] = Character.toLowerCase(c);
                }
            } else if (Character.isLowerCase(c)) {
                if (innerChar) {
                    chars[i] = Character.toUpperCase(c);
                }
            }
        }
        return new String(chars);
    }
}




