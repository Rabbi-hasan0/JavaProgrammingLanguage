package assaignmentjava;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter (Circumference) of the circle: " + perimeter);
        scanner.close();
    }
}
