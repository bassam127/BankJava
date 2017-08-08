import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transaction ;
    
    public Customer(String name , double initlization){
        
        this.name = name;
        this.transaction = new ArrayList<Double>();
        AddTransaction(initlization);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public void AddTransaction(double amount){
       transaction.add(amount);
    }
}
