package ARRAYS;
import java.util.*;
public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int m = sc.nextInt(); 
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        sc.close();
        int [] ans=new int[m+n];
        int k=0;
        for(int i=0;i<m;i++){
            ans[k++]=arr1[i];
        }
        for(int i=0;i<n;i++){
            ans[k++]=arr2[i];
        }
        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));
    }
}
