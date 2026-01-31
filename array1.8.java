//array8 copy elements
public class array8{

    public static void main(String[] args) {
        
        int a[] = { 1, 8, 3 };

        int b[] = new int[a.length];


        for (int i = 0; i < a.length; i++)
            b[i] = a[i];

        b[0]++;

        System.out.println("");

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        System.out.println("");

        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
}