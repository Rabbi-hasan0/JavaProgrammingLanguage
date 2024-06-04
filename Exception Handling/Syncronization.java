/*
Write a Java program that creates two threads, one for printing uppercase
letters from A to Z and the other for printing lowercase letters from a to z.
Ensure that the letters are printed in sequence, with uppercase letters followed
by lowercase letters. 
*/

//Solution:
package Again_Assaignment;

class LetterPrinter {
    private boolean upperTurn = true;

    public synchronized void Printupper(char letter) throws InterruptedException {
        while (!upperTurn) {
            wait();
        }
        System.out.print(letter + " ");
        upperTurn = false;
        notify();
    }

    public synchronized void Printlower(char letter) throws InterruptedException {
        while (upperTurn) {
            wait();
        }
        System.out.println(letter + " ");
        upperTurn = true;
        notify();
    }
}

class upperCase extends Thread {
   private LetterPrinter Letter; 
    public upperCase(LetterPrinter Letter) { 
        this.Letter = Letter;
    }

    public void run() {
        for (char c = 'A'; c <= 'Z'; c++) {
            try {
                Letter.Printupper(c);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class lowerCase extends Thread {
    private LetterPrinter Letter; 
    public lowerCase(LetterPrinter Letter) { 
        this.Letter = Letter;
    }

    public void run() {
        for (char c = 'a'; c <= 'z'; c++) {
            try {
                Letter.Printlower(c);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LetterPrinter L = new LetterPrinter();
        Thread upper = new upperCase(L); 
        Thread lower = new lowerCase(L);
        upper.start();
        lower.start();
        try {
            upper.join();
            lower.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
