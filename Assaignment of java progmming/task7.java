package assaignmentjava;
import javax.swing.*;

public class task7 {
    public static void main(String[] args) {
        JPasswordField passwordField = new JPasswordField();
        int option = JOptionPane.showConfirmDialog(null, passwordField, "Enter Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (option == JOptionPane.OK_OPTION) {
            char[] passwordChars = passwordField.getPassword();
            String password = new String(passwordChars);
            JOptionPane.showMessageDialog(null, "Your password is: " + password);
        } else {
            JOptionPane.showMessageDialog(null, "No password entered.");
        }
    }
}
