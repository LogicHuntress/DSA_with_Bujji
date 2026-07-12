/* Define two methods to print the maximum and the minimum number
   respectively among three numbers entered by the user.

// PSEUDOCODE

START

ENTER THREE NUMBERS
INPUT A, B, C

CALL MAX(A, B, C)
CALL MIN(A, B, C)

FUNCTION MAX(A, B, C)

    MAX = A

    IF (B > MAX)
        MAX = B

    IF (C > MAX)
        MAX = C

    PRINT "Maximum = ", MAX

END FUNCTION

FUNCTION MIN(A, B, C)

    MIN = A

    IF (B < MIN)
        MIN = B

    IF (C < MIN)
        MIN = C

    PRINT "Minimum = ", MIN

END FUNCTION

END
*/
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three values : ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        fun1(A, B, C);
        fun2(A, B, C);
        sc.close();
    }  
    
    static void fun1(int A, int B,int C) {
        int Max = A;
        if(B>Max){
            Max = B;
        }
        if(C>Max){
            Max = C;
        }
        System.out.println("Maximun num is : "+Max);

    }
    static void fun2(int A, int B, int C) {
        int Min = A;

        if(B<Min){
          Min = B;
        }
        if(C<Min){
            Min = C;
        } 
        System.out.println("Minimun num is : "+Min);
    }
    

    
}