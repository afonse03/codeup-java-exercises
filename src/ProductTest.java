public class ProductTest {
    // static method
    public static double findAveragePrice(Product[] products) {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPriceInCents();
//            System.out.println(product.getName() + " " + product.getPriceInCents());
        }
        return totalPrice / products.length;
    }

    // products array
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 2.19);
        products[1] = new Product("Eggs", 3.12);
        products[2] = new Product("Hot Cheetos", 1.09);
        products[3] = new Product("Bread", 2.00);
        products[4] = new Product("Cat food", 5.00);
        System.out.println("Average price is: ");
        System.out.printf("$%.2f", findAveragePrice(products));
    }
}
