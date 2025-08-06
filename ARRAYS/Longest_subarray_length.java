package ARRAYS;
import java.util.*;
public class Longest_subarray_length {
    public static void main(String[] args) {
        //Finding length of longest subrray whose sum is equal to zero

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int maxi=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=arr[i];
                if(sum==0){
                    maxi=Math.max(maxi, j-i+1);
                }
            }
        }
        System.out.println(maxi);
    }
}
