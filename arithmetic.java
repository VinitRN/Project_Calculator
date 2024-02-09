
import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        System.out.println("Square: " + Math.pow(number, 2));
        System.out.println("Cube: " + Math.pow(number, 3));

        System.out.print("Enter another number for modulus: ");
        double modulusNumber = scanner.nextDouble();
        System.out.println("Modulus: " + (number % modulusNumber));

        System.out.print("Enter the power value: ");
        int power = scanner.nextInt();
        System.out.println("Power: " + Math.pow(number, power));

        
    }
}
