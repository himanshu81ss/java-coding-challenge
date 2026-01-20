//switchcase3
import java.util.*;
public class switchcase3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        String daytype;
        String day;

        switch(a){
            case 1:
                day="monday";
                break;
            case 2:
                day="tuesday";
                break;
            case 3:
                day="wednesday";
                break;
            case 4:
                day="thursday";
                break;
            case 5:
                day="friday";
                break;
            case 6:
                day="saturday";
                break;
            case 7:
                day="sunday";
                break;
            default:
                day="this";

        }
        switch(a){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                daytype="workingday";
                break;
            case 6:
            case 7:
                daytype="weekend";
                break;
            default:
                daytype="invalid";
        }
        System.out.println(day + " is a " + daytype);



    }
}
