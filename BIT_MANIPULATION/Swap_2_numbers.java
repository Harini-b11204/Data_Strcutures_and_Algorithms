package BIT_MANIPULATION;
import java.util.*;
public class Swap_2_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a="+a+" b="+b);
    }

}
