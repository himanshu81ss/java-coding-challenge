
//dowhile2
import java.util.*;

public class dowhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 3;
        int guess;
        
        do {
            System.out.print("Guess the number between 1 and 5: ");
            guess = scanner.nextInt();
            
            if (guess != secretNumber) {
                System.out.println("Wrong guess. Try again!");
            }
        } while (guess != secretNumber);
        
        System.out.println("Congratulations! You guessed the correct number.");
       
    }
}
