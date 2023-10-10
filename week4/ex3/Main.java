package week4.ex3;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }

        createHistogram(arr);
    }

    static double giveAverage(int[] args){
        double average = 0.0;

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]+" ");
            average += args[i];
        }
        return average/args.length;
    }

    static void createHistogram(int[] args){
        for (int arg : args) {
            for (int i = 0; i < arg; i++) {
                System.out.print("*");
            }
            System.out.println(arg);
        }
    }
}
