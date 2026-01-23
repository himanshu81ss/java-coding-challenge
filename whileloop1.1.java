//whileloop1

class whileLoop {
    public static void main(String args[])
    {
        int a = 1, s = 0;
        while (a<= 10) {   
            s = s + a;
            a++;
        }
        System.out.println("Summation: " + s);
    }
}
