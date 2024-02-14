package assaignmentjava;

import java.util.Arrays;
import java.util.Scanner;

public class task20{
    
    public static int find(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int secondLargest = arr[n - 2];
        return secondLargest;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int ans = find(arr);
        System.out.println("The second largest element in the array is: " + ans);
    }
}
