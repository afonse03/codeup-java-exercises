public class MethodsExercises {
    public static void main (String[] args) {
        System.out.println(getAddition(10, 10));
        System.out.println(getSubtraction(20, 10));
        System.out.println(getMultiplication(10, 10));
        System.out.println(getDivision(10, 2));
        System.out.println(getModulus(10, 6));
    }
    public static int getAddition (int x, int y) {
        return x + y;
    }
    public static int getSubtraction (int x, int y) {
        return x - y;
    }
    public static int getMultiplication (int x, int y) {
        return x * y;
    }
    public static int getDivision (int x, int y) {
        return x / y;
    }
    public static int getModulus (int x, int y) {
        return x % y;
    }
}
