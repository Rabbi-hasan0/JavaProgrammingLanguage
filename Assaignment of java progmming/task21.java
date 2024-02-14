package assaignmentjava;
import java.util.Scanner;

public class task21{
    public static String reverseWords(String str){
        String[] words = str.split("\\s+");
        
        StringBuilder reversed = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String reversedString = reverseWords(inputString);
        
        System.out.println("Original string: " + inputString);
        System.out.println("String with words reversed: " + reversedString);
        
        scanner.close();
    }
}

    
