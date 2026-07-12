/*Write a function to check if a given triplet is a Pythagorean triplet or not. 
(A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
//pusedocode
START

ENTER A, B, C

CALL PYTHAGOREAN(A, B, C)

FUNCTION PYTHAGOREAN(A, B, C)

IF (A*A + B*B == C*C)

    PRINT "Pythagorean Triplet"

ELSE

    PRINT "Not Pythagorean Triplet"

END FUNCTION

END

*/
import java.util.Scanner;
public class PYTHAGOREAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values here : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Pythagorean(a, b, c);
        sc.close();

    }
    static void Pythagorean(int a, int b, int c) {
        if((a*a +b*b) == c*c){
            System.out.println("Pythagorean Triplet");
        }else {
            System.out.println("Not pythogrean triplet");
        }
        
    }
}