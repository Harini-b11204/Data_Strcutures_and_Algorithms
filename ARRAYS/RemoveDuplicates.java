package ARRAYS;
import java.util.*;
public class RemoveDuplicates {
    //Using Two pointer
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println("[]");
                return;
            }
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int i = 0;
            for (int j = 1; j < n; j++) {
                if (arr[j] != arr[i]) {
                    i++;
                    arr[i] = arr[j];
                }
            }
            int[] result = Arrays.copyOf(arr, i + 1);
            System.out.println(Arrays.toString(result));
        }
    }
}
