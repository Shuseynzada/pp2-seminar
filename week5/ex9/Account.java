package week5.ex9;
public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public double getBalance() {
        return this.balance;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        return this.customer.toString() + " balance=$"+Math.round(this.balance * 100.0) / 100.0;
    }

    public String getCustomerName(){
        return this.customer.getName();
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        if(this.balance - amount < 0) throw new InvalidAmountException();
        else this.balance -= amount; 
    }
}
