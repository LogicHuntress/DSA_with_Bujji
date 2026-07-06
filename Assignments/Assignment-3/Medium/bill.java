/*Calculate Electricity Bill
 // pusedocode
 START
        ENTER THE UNITS VALUES 
        INPUT UNIT
        RATE = 2
        RATE1 = 3
        RATE2 = 5 
        IF(UNIT > 200)
        PRINT UNIT *= RATE2
        ELSE IF (UNIT <= 200)
        PRINT UNIT *= RATE1
        ELSE IF(UNIT <=100)
        PRINT UNIT *=RATE
        ELSE
        PRINT INVALID
 END IF 
 END
*/
import java.util.Scanner;
public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit value : ");
        int unit = sc.nextInt();
        int rate = 2, rate1 = 3, rate2 = 5;

        if(unit <= 100){
            unit *=rate;
        } else if(unit <= 200){
            unit *= rate1;
        }else if(unit > 200){
            unit *= rate2;
        }else {
            System.out.println("invalid");
        }
        System.out.println("The Calculate Electricity Bill : " +unit);
        sc.close();

    }
}