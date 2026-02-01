//cloning array by arraycopy() method
public class array11 {

    public static void main(String[] args) {
      
        int a[] = { 4,6,1 };

        int b[] = new int[a.length];

        System.arraycopy(a, 0, b, 0, 3);

        b[0]++;

        System.out.println("");

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        System.out.println("");

        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
}