//function5
import java.util.*;
public class function5 {
    public static int printFactorial(int n){
        int factorial=1;
        for( int i=n;i>=1;i--){
            factorial=factorial*i;
        }
            System.out.println(factorial);
            return factorial;

        
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printFactorial(n);
    }
}
