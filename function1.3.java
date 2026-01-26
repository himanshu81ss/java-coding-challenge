//function3
import java.util.*;
public class function3 {
    public static void myString(String a){
        System.out.println("my name is " +a);
        return;  
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        myString(a);
    }
}
