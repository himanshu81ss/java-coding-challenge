
// copy using Arrays.copyOfRange() 
import java.util.Arrays; 
 
class GFG { 

    public static void main(String[] args) { 
      
        int a[] = { 3,8,5,9,5,1 }; 

        int b[] = Arrays.copyOfRange(a, 2, 6); 

     
        b[0]++;  

        System.out.println(""); 
        for (int i = 0; i < a.length; i++) 
            System.out.print(a[i] + " "); 

        System.out.println(""); 
        for (int i = 0; i < b.length; i++) 
            System.out.print(b[i] + " "); 
    } 
}