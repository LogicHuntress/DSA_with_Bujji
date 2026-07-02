/*Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

// pusedocode

START

INPUT Principal

INPUT Time

INPUT Rate

SI = (Principal * Time * Rate) / 100

OUTPUT SI

END

*/
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the PTR : ");
        int P = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();

        int SI = ((P*T*R)/100);

        System.out.println("Simple interest = "+SI);

        sc.close();

    }
    
}