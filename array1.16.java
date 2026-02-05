// array16 ,Java program to add two matrices
public class array16 {

    public static void main(String[] args) 
    {

        int A[][] = { { 4, 5}, { 2, 9 } };
        int B[][] = { { 1, 1 }, { 3, 8 } };

        int rows = A.length;
        int cols = A[0].length;


        int sum[][] = new int[rows][cols];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
              
 
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}