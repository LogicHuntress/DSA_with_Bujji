/*Write a Java program to find Armstrong numbers between two given numbers.

START

INPUT NUMBER

STORE ORIGINAL NUMBER

SUM = 0

WHILE NUMBER > 0

    DIGIT = NUMBER % 10

    SUM = SUM + (DIGIT × DIGIT × DIGIT)

    NUMBER = NUMBER / 10

END WHILE

IF SUM == ORIGINAL NUMBER

    PRINT "Armstrong"

ELSE

    PRINT "Not Armstrong"

END IF

END


*/

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int num = sc.nextInt();
        int org = num;

        int sum = 0;

        while(num>0){
            int digit = num% 10;
            sum = sum + (digit * digit * digit);
            num /= 10;
        }
        if(sum == org){
            System.out.println("Amstrong");
        } else {
            System.out.println("not Amstrong");
        }
        System.out.println();
        sc.close();
    }
}