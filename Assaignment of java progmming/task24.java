package assaignmentjava;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task24 {
     public static Map<Character, Integer>Frequency(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch); 
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }
        return frequencyMap;
    }
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        Map<Character, Integer> frequencyMap = Frequency(inputString);
        
        System.out.println("Frequency of characters in the string:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}