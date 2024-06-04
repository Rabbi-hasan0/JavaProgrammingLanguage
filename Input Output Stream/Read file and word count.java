package Again_Assaignment;

import java.io.*;

public class Murad {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\imrab\\OneDrive\\Documents\\New\\murad.txt"; // Replace with your file path
       int count = 0;
       String line; 
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            while((line = br.readLine()) != null) {  
            //Splits each line into words  
            String words[] = line.split(" ");  
            //Counts each word  
            count = count + words.length;  
  
        }  
  
           System.out.println("Number of words present in given file: " + count);  
          br.close();  
        }
    }
}
