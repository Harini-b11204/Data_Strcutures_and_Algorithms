package BINARY_SEARCH;
import java.util.*;
public class koko_eats_banana {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int h=sc.nextInt();
        sc.close();
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int start=1;
        int end=max;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int totalHours=0;
            for(int i=0;i<n;i++){
                totalHours+=Math.ceil((double)arr[i]/mid);
            }
            if(totalHours<=h){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        System.out.println(ans);
    }
}
