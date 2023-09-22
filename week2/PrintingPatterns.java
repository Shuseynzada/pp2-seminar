package week2;

public class PrintingPatterns {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print('*');
                } else {
                    System.out.print('#');
                }
            }
            System.out.println();
        }
        
    }
}
