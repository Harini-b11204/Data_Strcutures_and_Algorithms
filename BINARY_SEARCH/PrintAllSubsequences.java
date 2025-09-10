package BINARY_SEARCH;
import java.util.*;

public class PrintAllSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            return;
        }
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) arr[i] = sc.nextInt();
            else arr[i] = 0;
        }
        sc.close();

        List<Integer> curr = new ArrayList<>();
        printSubseq(arr, 0, curr);
    }

    private static void printSubseq(int[] arr, int idx, List<Integer> curr) {
        if (idx == arr.length) {
            if (curr.isEmpty()) {
                System.out.println("[]");
            } else {
                for (int i = 0; i < curr.size(); i++) {
                    if (i > 0) System.out.print(" ");
                    System.out.print(curr.get(i));
                }
                System.out.println();
            }
            return;
        }

        // Exclude current element
        printSubseq(arr, idx + 1, curr);
        // Include current element
        curr.add(arr[idx]);
        printSubseq(arr, idx + 1, curr);
        // backtrack
        curr.remove(curr.size() - 1);
    }
}
