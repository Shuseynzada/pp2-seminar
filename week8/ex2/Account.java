package week8.ex2;

public class Account implements Comparable<Account>  {
    private String firstname, lastname;
    private double balance;

    public Account(String firstname, String lastname, double balance){
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
    }

    public String getFullName(){
        return this.firstname+this.lastname;
    }

    public double getBalance(){
        return this.balance;
    }

    @Override
    public String toString(){
        return "["+firstname+","+lastname+","+balance+"]";
    }

    @Override
    public int compareTo(Account o) {
        int fullNameComparison = this.getFullName().compareTo(o.getFullName());
        if(fullNameComparison ==  0) return Double.compare(this.balance, o.balance); 
        return fullNameComparison;
    }
    
}
