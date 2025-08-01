package BIT_MANIPULATION;
import java.util.*;
public class Count_set_bits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int count=0;
        for(int i=0;i<32;i++){
            if(((n>>i)&1)!=0){
                count++;
            }
        }
        System.out.println(count);

    }
}
