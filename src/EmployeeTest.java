public class EmployeeTest {
    public static void main(String[] args) {
        Employee one = new Employee();
        one.name = "Charlie";
        Employee two = new Employee();
        two.name = "Callie";
        Employee three = new Employee();
        three.name = "Gilbert";
        three.displayEmployeeInfo();
        three.randomQuote();
        System.out.println(Employee.company);
    }
}
