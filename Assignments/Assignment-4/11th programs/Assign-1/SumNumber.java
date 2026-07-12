/*Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
//pusedocode
START

SUM = 0

CALL SUMFUNCTION()

FUNCTION SUMFUNCTION()

WHILE(TRUE)

    ENTER NUMBER OR x

    INPUT VALUE

    IF(VALUE == "x" OR VALUE == "X")

        BREAK

    CONVERT VALUE TO INTEGER

    SUM += NUMBER

END LOOP

PRINT SUM

END FUNCTION

END

*/
import java.util.Scanner;

public class SumNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        sum(sc);

        sc.close();
    }

    static void sum(Scanner sc) {

        int sum = 0;

        while (true) {

            System.out.print("Enter a number or x to stop: ");

            String input = sc.next();

            if (input.equalsIgnoreCase("x")) {
                break;
            }

            int number = Integer.parseInt(input);

            sum += number;
        }

        System.out.println("Sum = " + sum);
    }
}