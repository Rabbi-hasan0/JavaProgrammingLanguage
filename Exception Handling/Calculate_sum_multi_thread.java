/*
Write a Java program that calculates the sum of all numbers from 1 to 100
using multiple threads. Divide the range of numbers into equal segments and
assign each thread to compute the sum of a segment. Then, combine the results
from all threads to get the final sum. 
*/


//Solution:
package Again_Assaignment;

class SumThread implements Runnable {
    private int start;
    private int end;
    private int sum;

    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }

    public int getSum() {
        return sum;
    }
}

public class Main {
    
    public static void main(String[] args) {
        int totalNumbers = 100;
        int numberOfThreads = 4; 
        int segmentSize = totalNumbers / numberOfThreads;

        SumThread[] sumThreads = new SumThread[numberOfThreads];
        Thread[] threads = new Thread[numberOfThreads];

        // Create and start threads
        for (int i = 0; i < numberOfThreads; i++) {
            int start = i * segmentSize + 1;
            int end = (i == numberOfThreads - 1) ? totalNumbers : start + segmentSize - 1;
            sumThreads[i] = new SumThread(start, end);
            threads[i] = new Thread(sumThreads[i]);
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int totalSum = 0;
        for (int i = 0; i < numberOfThreads; i++) {
            totalSum += sumThreads[i].getSum(); 
        }

        System.out.println("The total sum from 1 to 100 is: " + totalSum);
    }
}
