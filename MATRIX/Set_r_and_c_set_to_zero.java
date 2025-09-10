package MATRIX;
import java.util.*;
public class Set_r_and_c_set_to_zero {
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

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (sc.hasNextInt()) arr[i][j] = sc.nextInt();
                else arr[i][j] = 0;
            }
        }
        sc.close();

        if (n == 0 || m == 0) return;

        // Use first row and first column as markers to achieve O(1) extra space
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        for (int j = 0; j < m; j++) if (arr[0][j] == 0) { firstRowHasZero = true; break; }
        for (int i = 0; i < n; i++) if (arr[i][0] == 0) { firstColHasZero = true; break; }

        // Mark rows and columns using first row/col
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        // Use marks to set zeros
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr[i][0] == 0 || arr[0][j] == 0) arr[i][j] = 0;
            }
        }

        // Zero first row/column if needed
        if (firstRowHasZero) {
            for (int j = 0; j < m; j++) arr[0][j] = 0;
        }
        if (firstColHasZero) {
            for (int i = 0; i < n; i++) arr[i][0] = 0;
        }

        // Print result
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
                if (j < m - 1) System.out.print(" ");
            }
            System.out.println();
        }

    }
}
