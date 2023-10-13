package week5.ex9;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(10, "Samxal", 'M');
        Account ac1 = new Account(12, c1, 100.126);
        System.out.println(ac1.toString());
    }
}
