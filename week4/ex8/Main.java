package week4.ex8;

public class Main {
    public static void main(String[] args) {
        String str = "Baku";

        System.out.println(explodeStr(str));
    }

    static String explodeStr(String s){
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                res+=s.charAt(j);
            }
        }

        return res;
    }
}
