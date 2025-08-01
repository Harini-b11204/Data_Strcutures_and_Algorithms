package ARRAYS;
import java.util.*;
public class Target_pair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        sc.close();
        boolean check=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+" "+arr[j]);
                    check=true;
                }
            }
        }
        if(check==false){
            System.out.println("No pair found");
        }
    }
}
