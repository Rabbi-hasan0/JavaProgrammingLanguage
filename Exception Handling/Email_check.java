/*Question:
Write a Java program to validate an email address entered by the user.
Implement multiple catch blocks to handle different types of exceptions that
may occur during validation, such as IllegalArgumentException for invalid
format and NullPointerException for null input. Use a finally block to close
any resources opened during validation. 
*/


package Again_Assaignment;

import java.util.*;
import java.util.regex.*;

class Check{
    public void validateEmail(String email) {
        if (email == null) {
            throw new NullPointerException();
        }

        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern p = Pattern.compile(emailRegex);
        Matcher m = p.matcher(email);

        if (!m.matches()) {
            throw new IllegalArgumentException("The email address is not format.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Check check = new Check();
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.print("Enter Mail: ");
            String email = scanner.nextLine();

            check.validateEmail(email);
            System.out.println("Email address is valid.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("Email address cannot be null.");
        } finally {
            if (scanner != null) {
                System.out.println("Scanner closed.");
            }
        }
    }
}
