package MATRIX;
import java.util.*;
public class Transpose_of_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Basic input-safety: ensure dimensions are present
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (sc.hasNextInt()) matrix[i][j] = sc.nextInt();
                else matrix[i][j] = 0;
            }
        }
        sc.close();
        int[][] transposed = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
