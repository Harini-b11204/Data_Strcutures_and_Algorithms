package BIT_MANIPULATION;
import java.util.*;
public class Set_m_1s_and_n_0s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.close();
        System.out.println(((1<<m)-1)<<n);
    }

}
