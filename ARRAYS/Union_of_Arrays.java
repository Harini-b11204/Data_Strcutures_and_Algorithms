package ARRAYS;
import java.util.*;
public class Union_of_Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        sc.close();
        ArrayList <Integer> al=new ArrayList<>();
        int i=0,j=0;
        while (i<n && j<m) {
            if (arr1[i] < arr2[j]) {
                if (al.isEmpty() || al.get(al.size() - 1) != arr1[i]) {
                    al.add(arr1[i]);
                }
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (al.isEmpty() || al.get(al.size() - 1) != arr2[j]) {
                    al.add(arr2[j]);
                }
                j++;
            } else { 
                if (al.isEmpty() || al.get(al.size() - 1) != arr1[i]) {
                    al.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
         while (i < n) {
             if (al.isEmpty() || al.get(al.size() - 1) != arr1[i]) {
                 al.add(arr1[i]);
             }
             i++;
         }
         while (j < m) {
             if (al.isEmpty() || al.get(al.size() - 1) != arr2[j]) {
                 al.add(arr2[j]);
             }
             j++;
         }
        System.out.println(al);
    }
}
