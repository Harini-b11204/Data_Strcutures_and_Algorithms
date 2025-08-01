package ARRAYS;
import java.util.*;
public class Leaders_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList <Integer> al=new ArrayList<>();
        sc.close();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                al.add(arr[i]);
                Collections.reverse(al);
                
            }
        }
        System.out.println(al);
    }
}
