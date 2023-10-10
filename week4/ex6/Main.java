package week4.ex6;

public class Main {
    public static void main(String[] args) {
        int n = 100; // Change this to the desired range of prime numbers
        boolean[] isPrime = new boolean[n + 1];

        // Initialize all elements of the array to true
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Start with the first prime number (2)
        for (int p = 2; p * p <= n; p++) {
            // If isPrime[p] is still true, it's a prime number
            if (isPrime[p]) {
                // Set all multiples of p to false
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Print the prime numbers
        System.out.println("Prime numbers in the range 2 to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }

    }
}
