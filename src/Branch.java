import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Branch {

    private String name;
    private List<Customer> customers;

    public Branch(String name ){
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }
/**
 * 
 * @param customerName
 * @param initAmount
 * @return true if customer not exist and add as new customer 
 * @return false if customer already exist 
 */
    public boolean addCustomer(String customerName, double initAmount){
        if(findCustomer(customerName)==null){
            this.customers.add(new Customer(customerName, initAmount));
            return true;
        }
        return false;
    }
    /**
     * 
     * @param customerName
     * @param amount
     * @return true if customer exist and add amount of money
     * @return false if customer doesn't exist 
     */
    public boolean addCustomerTransaction(String customerName , double amount){

        Customer existingCustomer = findCustomer(customerName);

        if(existingCustomer != null){
            existingCustomer.AddTransaction(amount);
            return true;
        }
        return false;
    }
/**
 * @param customerName
 * @return  the customer name if customer exist other wise 
 * @return null 
 */
    private Customer findCustomer (String customerName){
        for(int i =0 ; i<customers.size(); i++){
            Customer checkCustomer =this.customers.get(i);
            if(checkCustomer.getName().equals(customerName)){
                return checkCustomer;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

}
