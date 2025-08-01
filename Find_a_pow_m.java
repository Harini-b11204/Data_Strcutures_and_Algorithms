import java.util.*;
public class Find_a_pow_m {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int m=sc.nextInt();
        sc.close();
        int res=1;
        while(m>0){
            if((m&1)!=0){
                res*=a;
            }
            a*=a;
            m=m>>1;
        }
        System.out.println(res);
    }

}
