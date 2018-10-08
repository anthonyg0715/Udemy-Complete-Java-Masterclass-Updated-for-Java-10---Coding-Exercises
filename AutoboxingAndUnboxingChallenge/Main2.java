/**
 * For all the classes we made in this challenge it is just to show how Autoboxing and Unboxing works
 */
public class Main2 {
    public static void main(String[] args) {
        Bank bank1 = new Bank("TDBank");
        bank1.addBranch("HigherUp");
        bank1.addCustomer("HigherUp","Anthony",900.00);
        bank1.addCustomer("HigherUp","Tim",800.00);
        bank1.addCustomer("HigherUp","John",700.00);

        bank1.addBranch("NextUp");
        bank1.addCustomer("NextUp","Melanie",600.00);

        bank1.addCustomerTransaction("HigherUp","Anthony", 100.00);
        bank1.addCustomerTransaction("HigherUp","Tim", 50.50);
        bank1.addCustomerTransaction("HigherUp","John",50.00);

        bank1.listCustomers("HigherUp",true);
        bank1.listCustomers("NextUp",true);
    }
}
