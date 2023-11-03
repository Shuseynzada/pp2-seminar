import week3.ex2.Invoice;
import week5.ex9.*;
public class Main {
    public static void main(String[] args) {
        //3
        Invoice a = new Invoice("S", "pd", 2, 2.0);
        System.out.println(a.getInvoiceAmount());

        //4 
        Customer costumer1 = new Customer(11, "Samxal", 'm');
        Account ac1 = new Account(101, costumer1, 100);
        ac1.withdraw(100);  // try 101

    }
}

