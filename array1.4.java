
// array4 find max using Collections.max() method
import java.util.*;

public class array4
{
    public static void main(String[] args)
    {      
      
        int arr[] = {4,5,10,12,35,69,90,234};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) 
            list.add(arr[i]);
        System.out.println(Collections.max(list));
    }
}