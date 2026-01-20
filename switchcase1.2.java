//switchcase4

import java.util.*;
public class switchcase4{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String state =sc.next();

        switch (state){
            case "mp":
                System.out.println("bhopal");
                break;
            case "up":
                System.out.println("lucknow");
                break;
            case "gujrat":
                System.out.println("ahemdabad");
                break;
            case "bihar":
                System.out.println("patna");
            default:
                System.out.println("invalid state");

                


        }
    }

}
