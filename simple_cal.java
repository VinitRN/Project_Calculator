public class simple_cal {
    public static void main(String[] args) {
        // User input values (you can change these)
        int num1 = 10;
        int num2 = 5;

        // Displaying the provided values
        System.out.println("Using values: " + num1 + " and " + num2);

        // Performing basic arithmetic operations and printing the results
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));

        // Checking if the second number is not zero before performing division and modulo operations
        if (num2 != 0) {
            System.out.println("Quotient: " + (num1 / num2));
            System.out.println("Remainder: " + (num1 % num2));
        } else {
            // Handling division by zero
            System.out.println("Cannot divide by zero.");
        }
    }
}
