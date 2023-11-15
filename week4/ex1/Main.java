package week4.ex1;

public class Main {
    public static void main(String[] args) {

        double average = 0.0;

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]+" ");
            average += Integer.parseInt(args[i]);
        }
        System.out.println();
        System.out.println(average/args.length);
    }
}