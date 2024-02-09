import java.util.Scanner;

public class mathoperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        System.out.println("Square Root: " + Math.sqrt(number));
        System.out.println("Absolute Value: " + Math.abs(number));
        System.out.println("Logarithm (base 10): " + Math.log10(number));
        System.out.println("Sine: " + Math.sin(number));
        System.out.println("Cosine: " + Math.cos(number));
        System.out.println("Tangent: " + Math.tan(number));

        scanner.close();
    }
}
