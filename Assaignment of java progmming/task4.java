package assaignmentjava;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Number: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println("The sum of the digits of is: " + sum);
    }
}
