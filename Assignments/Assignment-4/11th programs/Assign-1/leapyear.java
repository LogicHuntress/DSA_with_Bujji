/*Input a year and find whether it is a leap year or not.
//pusedocode
START
    ENTER YEAR
    CALL LEAP(YEAR)

    FUNCTION LEAP(INT YEAR)
    IF((YEAR%4 == 0 && YEAR % 100 != 0) || YEAR % 400 == 0))
    PRINT LEAP YEAR
    ELSE
    NOT LEAP YEAR
    END IF
    END FUNCTION
END
*/
import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = sc.nextInt();
        leapyear(year);

        sc.close();
    }
    static void leapyear(int year) {
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("leap year");
        }
        else {
            System.out.println("not leap year");
        }
        
    }
}