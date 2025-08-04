package ARRAYS;
import java.util.*;
public class ProductExceptK {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                solve(sc);
            }
        }
    }
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt(); 
        if (n == 1) {
            System.out.println(1);
            return;
        }
        long[] prefix = new long[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * arr[i];
        }

        long[] suffix = new long[n];
        suffix[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * arr[i];
        }

        long result;
        int index = k - 1; 
        if (index == 0) {
            result = suffix[1]; 
        } else if (index == n - 1) {
            result = prefix[n - 2]; 
        } else {
            result = prefix[index - 1] * suffix[index + 1];
        }
        System.out.println(result);
    }
}
