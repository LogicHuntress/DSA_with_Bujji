/* Write a program to print whether a number is even or odd, also take input from the user.
   // Psuedo code of this 
   START 
   INPUT NUM 
   IF(NUM % 2 == 0)
   OUTPUT "EVEN"
   ELSE
   OUTPUT "ODD"
   END IF
   END
*/

import java.util.Scanner;

public  class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num: ");

        int n  = input.nextInt();

        if(n % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        input.close();
    }
}