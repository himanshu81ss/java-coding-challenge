//array find max using sort function
import java.io.*;
import java.util.*;

public class array3 
{
    public static void main(String[] args)
    {    
        int arr[] = {01,55,23,89,90,110,890};
        Arrays.sort(arr);
      
        System.out.println(arr[arr.length - 1]);
    }
}