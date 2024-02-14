package assaignmentjava;

import java.util.Scanner;

public class task22{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int alphabetCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (Character.isLetter(ch)) {
                alphabetCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                specialCharCount++;
            }
        }
        System.out.println("Total number of alphabets: " + alphabetCount);
        System.out.println("Total number of digits: " + digitCount);
        System.out.println("Total number of special characters: " + specialCharCount);
    }
}
