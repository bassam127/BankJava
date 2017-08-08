import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private List<Customer> customers;
    private List<Branch> branches;

    public Bank(String name){
        this.name = name;
        customers = new ArrayList<>();
        branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName)== null){
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }
    
    public boolean addCustomer(String customerName,String branchName, double initAmount) {
        
        Branch branch = findBranch(branchName);
        if(branch!=null){
            return branch.addCustomer(customerName,initAmount);
        }
        return false;
    }
    
    public boolean addCustomerTransaction(String branchName , String customerName , double amount){
        
      Branch branch = findBranch(branchName);
      if(branch != null){
          return branch.addCustomerTransaction(customerName, amount);
      }
      
      return false;
    }

    private Branch findBranch(String branchName){
        for(int i =0 ; i<branches.size(); i++){
           Branch exustingBranch = this.branches.get(i);
            if(exustingBranch.getName().equals(branchName)){
                return exustingBranch;
            }
        }
        return null;
    }
}
