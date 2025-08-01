package ARRAYS;
import java.util.*;
public class Left_shift {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        sc.close();
        int temp[]=new int[n];
        int j=0;
        for(int i=k;i<n;i++){
            temp[j]=arr[i];
            j++;
        }
        for(int i=0;i<k;i++){
            temp[j++]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }

    }
}
