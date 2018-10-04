/*
@Author Anthony Garzon
@Date 10/4/2018
@Program Bank Account
@Description Going over classes and constructors and then a challenge we had to do which is listed below
 */
public class Main {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("12345",500.00,"Anthony","myemail@email.com","(555) 555-0123");
        myAccount.deposit(150);
        myAccount.withdraw(120);

        //Challenge is to create a new class VipCustomer
        //It should have 3 fields name, credit limit, and email address
        //1st constructor should have all three parameters
        //2nd constructor should have only 2 parameters and use this to call the original constructor and pass in
        //name and credit again along with a default value for the email
        //3rd constructor should have all fields default in a constructor called within it
        VipCustomer anthony = new VipCustomer("Anthony",25000.00);
        System.out.println(anthony.getName() + " " + anthony.getCreditLimit());

        VipCustomer customer2 = new VipCustomer("John",50000.00,"JohnDoe@email.com");
        System.out.println(customer2.getName() + " " + customer2.getCreditLimit() + " " + customer2.getEmailAddress());

        VipCustomer customer3 = new VipCustomer();
        System.out.println(customer3.getName());
    }
}
