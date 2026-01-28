//pattern6
import java.util.*;
public class function6 {
    public static  int printGreatest(int a,int b){
         int c;
        if(a>b){
            c=a;
        }
        else{
            c=b;
        }
        
        return c;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=printGreatest(a,b);
    System.out.print(c);
   
}
}
