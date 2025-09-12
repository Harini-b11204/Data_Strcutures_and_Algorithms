import java.util.*;
public class binary_search {
    Scanner sc=new Scanner(System.in);
    public int binarysearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        binary_search bs=new binary_search();
        int n=bs.sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=bs.sc.nextInt();
        }
        int target=bs.sc.nextInt();
        bs.sc.close();
        int result=bs.binarysearch(arr, target);
        System.out.println(result);
    }
}
