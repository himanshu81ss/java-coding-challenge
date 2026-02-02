//check array equal or not by using builtin function

import java.util.Arrays;

public class array14 {
    public static void main(String[] args) {

        int a[] = {4,5,6};
        int b[] = {4,5,6};

        boolean r = Arrays.equals(a, b);

        if (r) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}