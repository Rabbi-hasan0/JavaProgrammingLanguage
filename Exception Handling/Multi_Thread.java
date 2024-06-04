/* Question:
Write a program to create four threads. Inside the first thread print your Dept.
10 times but wait for 2 second before printing each time. Inside the second
thread print your Name 20 times. Inside the third thread print your ID 30
times. Make sure second thread gets more OS access than the first thread and
the third thread starts after finishing the second thread. 
*/



// Solution:
package Again_Assaignment;

class deptThread extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("CSE");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class nameThread implements Runnable{
    public void run(){
        for(int i = 0; i < 10; i++) {
            System.out.println("Rabbi Hasan");
        }
    }
}
class idThread extends Thread{
     private Thread depend;
     public idThread(Thread depend){
         this.depend = depend;
     }
    public void run() {
       try{
           depend.join();
       }catch(InterruptedException e){
           e.printStackTrace();
       }
       
       for(int i = 0; i < 15; i++) {
           System.out.println("162");
       }
    }
}
public class New{
    public static void main(String[] args) {
        Thread dept = new Thread(new deptThread(), "Department");
        Thread name = new Thread(new nameThread(), "Name");
        Thread id = new Thread(new idThread(name), "ID");
        
        dept.start();
        name.start();
        
        try{
            name.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        id.start();
    }
}
