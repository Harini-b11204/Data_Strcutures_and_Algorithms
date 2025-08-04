package ARRAYS;
import java.util.*;;
public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int [] result=new int[n];
        int l=0;
        for( int num:arr){
            if(num!=0){
                result[l++]=num;
            }
        }
        while(l<n){
            result[l++]=0;
        }
        System.out.println(Arrays.toString(result));
    }
}
