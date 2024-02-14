package assaignmentjava;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        System.out.println("Sum: " + sum);
        double division = num1 / num2;
        System.out.println("Division: " + division);
        double product = num1 * num2;
        System.out.println("Product: " + product);
    }
}
