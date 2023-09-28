package week3.ex2;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice part1 = new Invoice("s1", "s2", 30, 12);
        System.out.println(part1.getPartNumber());
        System.out.println(part1.getPartDescription());
        System.out.println(part1.getQuantity());
        System.out.println(part1.getPrice());
        System.out.println(part1.getInvoiceAmount());
    }
}
