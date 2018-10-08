import java.util.ArrayList;

public class Bank {

    private String name;

    private  ArrayList<Branch> branchesArrayList;

    public Bank(String name) {
        this.name = name;
        this.branchesArrayList = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branchesArrayList.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.newCustomer(customerName,initialAmount);
        }
        return false;
    }


    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }
    public Branch findBranch(String branch){
        for(int i=0; i<this.branchesArrayList.size(); i++){
            Branch branchFound = this.branchesArrayList.get(i);
            if(branchFound.getName().equals(branch)){
                return branchFound;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branchName != null){
            System.out.println("Customers for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomersPerBranch();
            for(int i=0; i<branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer " + branchCustomer.getName() + "[" + (i+1) + "]");
                if(showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j=0; j<transactions.size(); j++){
                        System.out.println("[" + (j+1) + "]" + " Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }else{
            return false;//couldn't find a branch
        }
    }


}
