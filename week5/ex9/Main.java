public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(10, "Samxal", 'M');
        Account ac1 = new Account(12, c1, 100.126);
        ac1.withdraw(102);
    }
}
