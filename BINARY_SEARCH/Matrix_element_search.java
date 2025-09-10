package BINARY_SEARCH;
import java.util.*;
public class Matrix_element_search {
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int arr[][]=new int[m][n];
    public boolean isPresent(int target){
        int start=0;
        int end=m*n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int mid_element=arr[mid/n][mid%n];
            if(mid_element==target){
                return true;
            }
            else if(mid_element<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Matrix_element_search mes=new Matrix_element_search();
        for(int i=0;i<mes.m;i++){
            for(int j=0;j<mes.n;j++){
                mes.arr[i][j]=mes.sc.nextInt();
            }
        }
        int target=mes.sc.nextInt();
        mes.sc.close();
        boolean result=mes.isPresent(target);
        System.out.println(result);
    }
}
