package week3.ex3;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(1, 1, 2001);
        CustomDate date2 = new CustomDate(1, 1, 2002);
        System.out.println(date1.getDay());
        System.out.println(date1.getMonth());
        System.out.println(date1.getYear());
        date1.displayDate();
        date1.displayFormatted();
        System.out.println(date1.difference(date2));
        System.out.println(CustomDate.compare(date1, date2));
    }
}
