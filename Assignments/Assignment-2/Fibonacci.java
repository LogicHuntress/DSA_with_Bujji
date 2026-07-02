/*To calculate Fibonacci Series up to n numbers.

START

INPUT N          // Number of terms to print

SET A = 0
SET B = 1

OUTPUT A
OUTPUT B

REPEAT from 3 to N

    TEMP = A + B

    OUTPUT TEMP

    A = B

    B = TEMP

END REPEAT

END

*/
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);

        System.out.print("Enter the N Number : ");
        int N = In.nextInt();

        if(N == 0) {
            return;
        } else if (N == 1){
            System.out.print(0);
            return;
        }



        int A = 0;
        int B = 1;


        System.out.print(A + " ");
        System.out.print(B + " ");
        

        for(int i = 3; i<=N; i++){

            int temp = A+B;
            System.out.print(temp+ " ");
            A = B;
            B = temp;
        }

        System.out.println();
        In.close();
    }

}