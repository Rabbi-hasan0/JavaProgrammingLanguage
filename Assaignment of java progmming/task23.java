package assaignmentjava;
import java.util.Scanner;

public class task23{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String mainString = scanner.nextLine();
        
        System.out.print("Enter the substring to check: ");
        String substring = scanner.nextLine();
        
        boolean isSubstringPresent = checkSubstring(mainString, substring);
        
        if (isSubstringPresent) {
            System.out.println("The substring '" + substring + "' is present in the string.");
        } else {
            System.out.println("The substring '" + substring + "' is not present in the string.");
        }
        
        scanner.close();
    }
    
    public static boolean checkSubstring(String mainString, String substring) {
        return mainString.contains(substring);
    }
}
