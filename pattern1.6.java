
//pattern6
public class pattern6 {
    
    public static void printPattern(String[] args)
    {
        int n=7;
        int i, j;
        
        for (i = 1; i <= n; i++) {
            
            for (j = 1; j <= i; j++) {
                
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

   