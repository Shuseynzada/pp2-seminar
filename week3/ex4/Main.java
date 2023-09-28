package week3.ex4;

public class Main {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime(13, 20, 30);
        System.out.println(time1.toUniversalString());
        System.out.println(time1.toStandardString());
    }
}
