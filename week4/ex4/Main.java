package week4.ex4;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[args.length-1];
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i < args.length; i++) {
            arr[i-1] = Integer.parseInt(args[i])-1;
        }

        int[][] newMatrix = listToAdjacency(arr, n);

        for (int[] row : newMatrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    static int[][] listToAdjacency(int[] args, int n) {
        int[][] matrix = new int[n][n];
        for (int i = 1; i < args.length; i += 2) {
            int from = args[i - 1];
            int to = args[i];
            matrix[from][to] = 1;
            matrix[to][from] = 1; // If the graph is undirected, you might want to set the reverse connection as well.
        }

        return matrix;
    }
}
