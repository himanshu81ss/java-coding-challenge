//array to print element in matrix
import java.io.*;
import java.util.*;


public class array6
{
    public static void print2D(int mat[][])
    {

        for (int[] row : mat)

            System.out.println(Arrays.toString(row));
    }

    public static void main(String args[])
        throws IOException
    {
        int mat[][] = { { 9, 10, 11, 19 },
                        { 5, 6, 7, 8 },
                        { 19, 12, 15, 19 } };
        print2D(mat);
    }
}
