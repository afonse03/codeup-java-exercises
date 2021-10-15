// warmup on 10/14/21
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

// work in progress
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
    }
}
