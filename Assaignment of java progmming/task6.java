package assaignmentjava;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int letter = 0, space = 0, number = 0,other = 0;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letter++;
            } else if (Character.isDigit(c)) {
                number++;
            } else if (Character.isWhitespace(c)) {
                space++;
            } else {
                other++;
            }
        }
        System.out.println("Number of letters: " + letter);
        System.out.println("Number of spaces: " + space);
        System.out.println("Number of numbers: " + number);
        System.out.println("Number of other characters: " + other);

        scanner.close();
    }
}
