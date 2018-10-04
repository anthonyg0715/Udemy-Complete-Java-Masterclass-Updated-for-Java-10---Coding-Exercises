public class BankAccount {

    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String name, String email, String phoneNumber){
        System.out.println("new account constructor worked");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made and new balance is " + this.balance);
    }

    public void withdraw(double withdrawAmount){
        if(this.balance - withdrawAmount < 0){
            System.out.println("Insufficient Funds");
        }else{
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " processed with remaining balance " + this.balance);
        }
    }
}
