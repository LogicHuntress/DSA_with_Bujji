/*Fibonacci Series In Java Programs

//psuedocode

START
INPUT N
IF(N ==0)
PRINT 0
STOP

IF(N == 1)
PRINT 1
STOP 

A  = 0
B = 1

PRINT A 
PRINT B

FOR i = 3 TO N

    TEMP = A + B

    PRINT TEMP

    A = B

    B = TEMP

END FOR

END



*/
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.println("Enter N value : ");

        int n = In.nextInt();

        if(n == 0){
            System.out.println(0);
            return;
            
        } 
        if(n == 1) {
            System.out.println(1);
            return;
            
        }

        int A = 0;
        int B = 1;

        System.out.println(A);
        System.out.println(B);

        

        for(int i = 3; i<=n; i++){

            int temp = (A+B);
            A = B;
            B = temp;

            System.out.println(temp);  

        }
        System.out.println();
        In.close();
    }
}