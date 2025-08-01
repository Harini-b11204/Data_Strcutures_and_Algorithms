package ARRAYS;
import java.util.*;
public class Missing_no_in_n_natural_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        boolean check=false;
        for(int j=1;j<n;j++){
            for(int i=0;i<n;i++){
                if(arr[i]==j){
                    check=true;
                    break;
                }
            }
            if(check==false){
                System.out.println(j);
            }
        }
    }
}
