package ARRAYS;
import java.util.*;
public class CompartmentWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int s,w,e;
        s=sc.nextInt();
        w=sc.nextInt();
        e=sc.nextInt();
        sc.close();
        s=s-1;
        e=e-1;
        sum+=(e-s+1)*w;
        System.out.println(sum);
    }
}
