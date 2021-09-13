public class D20 {
    public static int roll20() {
        return (int) (Math.random() * 20) + 1; //this is an example of casting; modifying the bits (deletes the decimal points and redefines
    }
}

// we prefer casting to int because some of the numbers generated from the Math.random are going to have decimals. By casting to int, we can get a whole number