public class MathTest {
    int mathTestInt = -23;
    int absoluteValueTest = Math.abs(mathTestInt);

    public static void main(String[] args) {
//        System.out.println(absoluteValueTest);
        int[] myArray = {3, 4, 5};
        System.out.println(MyMathMethods.arraySum(myArray));
    }
}
