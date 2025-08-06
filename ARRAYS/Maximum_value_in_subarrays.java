package ARRAYS;
import java.util.*;
public class Maximum_value_in_subarrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        //Kadane's Algorithm

        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                sum=0;
            }
            else{
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
