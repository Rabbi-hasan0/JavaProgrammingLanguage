package array.string;

import java.util.Scanner;
import javax.swing.*;

public class Reverse {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
           String num1 = JOptionPane.showInputDialog("Enter first num: ");
           int x = Integer.parseInt(num1);
           String num2 = JOptionPane.showInputDialog("Enter second num: ");
           int y = Integer.parseInt(num2);
           int sum = x + y;
           JOptionPane.showMessageDialog(null,"Total sum is: "+ sum, "..Addition..", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
