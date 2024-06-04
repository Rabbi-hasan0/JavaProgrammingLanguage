/* Problem:
Write a Java program to simulate bank account transactions. Implement trycatch blocks to handle
exceptions that may occur during withdrawal or deposit operations, such as InsufficientFundsException
for insufficient balance and NegativeAmountException for negative amounts. Use a finally block to
ensure that resources are properly released after each transaction. 
*/



// Solution:
package Again_Assaignment;

class NegativeAmountException extends Exception{
    public NegativeAmountException(String message){
        super(message);
    }
}
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}

class BankAccount {
    private double balance;
    double CheckBalance() {
        return balance;
    }
    BankAccount(double initial) {     // Constructor
        if(initial < 0) {
            this.balance = 0;
            System.out.println("Negative is not added");
        }else {
            this.balance = initial;
        }
    }
    
    void Diposite(double balance) throws NegativeAmountException{
        if(balance < 0) {
            throw new NegativeAmountException("Neg. balanced invalid.");
        }
        this.balance += balance;
    }
    void Withdraw(double balance) throws NegativeAmountException, InsufficientFundsException {
        if(balance < 0) {
            throw new NegativeAmountException("Neg. balanced invalid.");
        }
        if(balance > this.balance) {
            throw new InsufficientFundsException("Balance is not available.");
        }
        this.balance -= balance;
    }   
}

public class New {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00);
        try{
            account.Diposite(500);
            System.out.print("Diposite Successful.");
        }catch(NegativeAmountException e){
            System.out.print("Error:"+ e.getMessage());
        }
        finally{
            System.out.println("Your balance is "+account.CheckBalance());
        }
        
        try{
            account.Withdraw(1600);
            System.out.print("Withdraw Successful.");
        }catch(NegativeAmountException | InsufficientFundsException e) {
            System.out.print("Error: "+e.getMessage());
        }
        finally{
            System.out.println("Your balance is "+account.CheckBalance());
        }
    }
}
