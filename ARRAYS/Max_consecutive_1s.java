package ARRAYS;
import java.util.*;
public class Max_consecutive_1s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int max=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                count=0;
            }
            max=Math.max(max,count);
        }
        System.out.println(max);
    }
}
