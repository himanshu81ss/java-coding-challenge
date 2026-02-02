//check equal without using predefined function

import java.util.Arrays;

public class array15{

    private static void check(int a[], int b[]) {
        
        boolean res = true;

        if (a.length == b.length) {

            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                  
                    res = false; 
                    break;
                }
            }
        } else {
          
            res = false; 
        }

        if (res) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }

    public static void main(String[] args) {
 
        int a[] = { 10,20,31};
        int b[] = { 10, 20, 30 };
      
      	check(a, b);
      
        int c[] = { 90,80,70,60,50};
        int d[] = { 90,80,70,60,50};
      
      	check(c, d);
    }
}
