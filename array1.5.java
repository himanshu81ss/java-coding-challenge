//array2d
import java.io.*;
public class array5
{
    public static void print2D(int mat[][])
    {
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
    }

    public static void main(String args[])
        throws IOException
    {
        int mat[][] = { { 5, 6, 9, 11},
                        { 1, 2, 3, 4},
                        { 10, 12, 20, 39} };
        print2D(mat);
    }
}