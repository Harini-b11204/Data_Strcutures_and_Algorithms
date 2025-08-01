package BIT_MANIPULATION;
import java.util.*;
public class Check_k_is_set_bit_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        sc.close();
        int count=0;
        for(int i=0;i<32;i++){
            if(((n>>i)&1)!=0){
                count++;
            }
        }
        if(count>=k){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    } 
}
