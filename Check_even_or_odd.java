import java.util.*; 
public class Check_even_or_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if((n&1)!=1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }    
}
