// cloning array using  Arrays.copyOf()
import java.util.Arrays;

class array12 {

    public static void main(String[] args) {
       
        int a[] = { 4,5,6};

        int b[] = Arrays.copyOf(a, 3);

        b[0]++;

        System.out.println("");

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        System.out.println("");

        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
}