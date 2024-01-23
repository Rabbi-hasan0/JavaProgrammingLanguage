package javaapplication2;
class Recall{
    void getData(int First, int second, int fibo){
        System.out.print(First+" "+second+" ");
        for(int i = 1; i <= 200 && fibo < 1500; i++){
            fibo = First + second;
            First = second;
            second = fibo;
            System.out.print(fibo+" ");
        }
    }
}
public class Fibonnaci{
    public static void main(String[] args){
        Recall call = new Recall();
        call.getData(0, 1, 0);
    }
}
