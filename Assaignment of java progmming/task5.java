package assaignmentjava;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Number: ");
        int number = scanner.nextInt();
        int ans = 0;
        while (number != 0) {
            int digit = number % 10;
            ans = ans * 10 + digit;
            number /= 10;
        }
        System.out.println("Reverse number is: " + ans);
    }
}
