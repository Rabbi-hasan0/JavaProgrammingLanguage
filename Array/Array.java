package array.string;
import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            int n = input.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = input.nextInt();
            }
            Arrays.sort(a);
            for(int i = 0; i < n; i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
