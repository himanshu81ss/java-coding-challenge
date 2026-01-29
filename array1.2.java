//array to find max element using java stream
import java.util.Arrays; 

public class array2
{
    public static void main(String[] args)
    {
        int arr[] = {10,5,20,22,27,88}; 
        int max = Arrays.stream(arr).max().getAsInt(); 
      
        System.out.println(max); 
    } 

}
