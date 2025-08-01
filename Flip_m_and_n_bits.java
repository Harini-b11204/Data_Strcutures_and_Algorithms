import java.util.*;
public class Flip_m_and_n_bits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.close();
        int a=m^n;
        int count=0;
        while(a!=0){
            a=a&(a-1);
            count++;
        }
        System.out.println(count);

    }
}
