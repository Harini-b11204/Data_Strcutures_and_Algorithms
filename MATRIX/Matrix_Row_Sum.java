package MATRIX;
import java.util.*;
public class Matrix_Row_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int sum=0;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            al.add(sum);
        }
        System.out.println(al);
    }
}
