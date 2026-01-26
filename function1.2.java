
//function2
import java.util.*;

public class function2 {
    public static int calculateAvg(int a,int b,int c,int d){
        int avg=(a+b+c+d);
        return avg;

    }
    
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    
    int avg=calculateAvg(a,b,c,d);
    System.out.println(avg);
}
}
