/*Sum of Negative Numbers, Positive Even Numbers & Positive Odd Numbers
//pusedocde
START

NEGATIVE = 0
POSITIVE EVEN = 0
POSITIVE ODD = 0

WHILE(TRUE)

    ENTER NUMBER

    IF NUMBER == 0
        BREAK

    IF NUMBER < 0
        NEGATIVE += NUMBER

    ELSE IF NUMBER % 2 == 0
        POSITIVE EVEN += NUMBER

    ELSE
        POSITIVE ODD += NUMBER

END LOOP

PRINT NEGATIVE
PRINT POSITIVE EVEN
PRINT POSITIVE ODD

END

*/

import java.util.Scanner;
public class SumNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int NEGATIVE = 0;
        int POSITIVE_EVEN = 0;
        int POSITIVE_ODD = 0;

        while(true){
            System.out.println("Enter the number value : ");
            int NUMBER = sc.nextInt();
            
            if (NUMBER == 0){
               break;
            }
              if (NUMBER < 0) {
               NEGATIVE += NUMBER;
              }

             else if (NUMBER % 2 == 0){
                POSITIVE_EVEN += NUMBER;
             }

     else {
               POSITIVE_ODD += NUMBER;
         }
        
        }
        System.out.println("Negative Sum : " + NEGATIVE);
        System.out.println("Positive Even Sum : " + POSITIVE_EVEN);
        System.out.println("Positive Odd Sum : " + POSITIVE_ODD);
        sc.close();

    }


}