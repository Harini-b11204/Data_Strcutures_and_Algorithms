package ARRAYS;
import java.util.*;
public class Prefix_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            solve(sc);
        }
    }
    public static void solve(Scanner sc){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int l,r;
        l=sc.nextInt();
        r=sc.nextInt();
        sc.close();
        for(int i=l-1;i<r-1;i++){
            sum+=arr[i];
        }
        System.out.println(sum);   
    }
}
