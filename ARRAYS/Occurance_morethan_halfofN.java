package ARRAYS;
import java.util.*;
public class Occurance_morethan_halfofN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        //Moore's voting Algorithm

        int count=0;
        int ans=-1;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                ans=arr[i];
            }
            if(ans==arr[i]){
                count++;
            }
            else if(ans!=arr[i]){
                count--;
            }
        }
        if (count>n/2) {
            System.out.println(ans);
        }
        else{
            System.out.println(-1);
        }

    }
}
