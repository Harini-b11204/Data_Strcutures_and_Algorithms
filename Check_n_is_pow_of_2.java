import java.util.Scanner;
public class Check_n_is_pow_of_2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if((n&(n-1))==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

} 