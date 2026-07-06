/* Check Leap Year Or Not
START
        ENTER THE NUMBER
        INPUT NUM 
        IF(NUM % 4 == 0 || NUM % 400 == 0)
        LEAP YEAR
        ELSE 
        NON LEAPYER
        END IF
END
*/
import java.util.Scanner;
public class LeapyearOrnot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if((num % 4 == 0 && num % 100 != 0) || num % 400 == 0){
            System.out.println("Leap year");
        } else {
            System.out.println("Non-Leap year");
        }
        sc.close();
    }
}