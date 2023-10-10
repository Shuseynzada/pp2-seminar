package week4.ex2;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }

        System.out.println(giveMax(arr));
    }

    static int giveMin(int[] args){
        int res = args[0];
        for (int i = 0; i < args.length; i++) {
            res = Math.min(res,args[i]);
        }

        return res;
    }

    static int giveMax(int[] args){
        int res = args[0];
        for (int i = 0; i < args.length; i++) {
            res = Math.max(res,args[i]);
        }

        return res;
    }
}
