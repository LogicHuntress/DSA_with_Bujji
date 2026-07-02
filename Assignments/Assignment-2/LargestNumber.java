/* Take 2 numbers as input and print the largest number.

// PUSEDO CODE 

START
ENTER THE INPUT VALUES 
INPUT A
INPUT B
INPUT C
//LOGIC ONE
INPUT MAX A 
IF(B>MAX)
MAX = B
ELSE IF(C>MAX)
MAX = C

// LOGIC TWO
INPUT MAX = 0
IF(A> = B AND A>=C)
MAX = A
ELSE IF (B>=C AND B>=A)
MAX = B
ELSE (C>A)
MAX = C

//LOGIC THREE

INPUT MAX = MATH.MAX(C,MATH.MAX(A,B))

// OUTPUT IS SAME FOR ALL LOGICS 
OUTPUT MAX

END IF
END

*/

import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);

        System.out.println("Enter the numbers : ");

        int a = In.nextInt();
        int b = In.nextInt();
        int c = In.nextInt();



        /*int max = a; // Assume

        if(b>max){
            max = b;
        }  if(c>max) {
            max = c;

        } else {
            System.out.println("Invalid");
        }  

       int max = 0;
       if(a>=b && a>=c){
        max = a;
       } else if(b>=a && b>=c){
        max = b;
       } else {
            max = c;
        } */

       int max = Math.max(c,Math.max(a,b));
        System.out.println("largest number : "+max);

        }
    }

