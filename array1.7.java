//array program to print elements of 2darray
import java.io.*;
import java.util.*;

 public class array7 
{
    public static void print2D(int mat[][])
    {
        System.out.println(Arrays.deepToString(mat));
    }

    public static void main(String args[]) throws IOException
    {
        int mat[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 } };
                        
        print2D(mat);
    }
}
