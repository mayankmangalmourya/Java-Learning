package Core_Java.OOPS;

class Account{
    int accountNo;
    String name;
    double balance;
    void createAccount(int no, String holderName, double amount){
        accountNo = no;
        name = holderName;
        balance = amount;
    }
    void deposit(int amount){
        balance += amount;
        System.out.println("Deposited amount is: "+amount);
        System.out.println("Total Outstanding Amount : "+balance);
    }
    void withdraw(int amount){
        if(amount <= balance){
            System.out.println("Successfully Withdraw : "+amount);
            balance -= amount;
            System.out.println("Remaining Balance : "+balance);
        }else{
            System.out.println("Insufficient balance");
        }
    }
    void displayDetails(){
        System.out.println("----------------------------");
        System.out.println("Account No : "+accountNo);
        System.out.println("Account Holder Name : "+name);
        System.out.println("Account Balance : "+balance);
        System.out.println("----------------------------");
    }
}

public class O5_AccountExample {

    static void transfer(Account sender, int amount, Account receiver) {
        if (amount <= sender.balance) {
            sender.withdraw(amount);
            receiver.deposit(amount);
            System.out.println("Amount Transferred Successfully.");
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public static void main(String[] args) {
        Account holder1 = new Account();
        Account holder2 = new Account();
        holder1.createAccount(12345, "Rahul", 10000);
        holder2.createAccount(67890, "Rohan", 5000);
        holder1.displayDetails();
        holder1.deposit(5000);
        holder1.withdraw(2000);
        holder2.displayDetails();
        holder2.deposit(2000);
        holder2.withdraw(1000);
        transfer(holder1, 3000, holder2);
        holder1.displayDetails();
        holder2.displayDetails();
    }
}
