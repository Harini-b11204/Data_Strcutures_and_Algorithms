package BINARY_SEARCH;
import java.util.*;
public class aggressive_cows {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int c=sc.nextInt();
    int arr[]=new int[n];
    public boolean isPossible(int mid){
        int count=1;
        int last_position=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]-last_position>=mid){
                count++;
                if(count==c){
                    return true;
                }
                last_position=arr[i];
            }
        }
        return false;
    }
    public int aggressiveCows(){
        Arrays.sort(arr);
        int start=1;
        int end=arr[n-1]-arr[0];
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isPossible(mid)){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        aggressive_cows ac=new aggressive_cows();
        for(int i=0;i<ac.n;i++){
            ac.arr[i]=ac.sc.nextInt();
        }
        ac.sc.close();
        int result=ac.aggressiveCows();
        System.out.println(result);
    }
}
