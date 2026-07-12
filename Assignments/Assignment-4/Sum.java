/*Write a program to print the sum of two numbers entered by user by defining your own method.
//pusedocode
START
    ENTER THE VALUES 
    INPUT A, B
    CALL SUM(A,B)
    SUM = A+B
    PRINT SUM
    END FUNCTION 
END
*/
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Sum(a,b);
        sc.close();
    }
    static void Sum(int a, int b) {
        int Sum = 0;
        Sum = (a + b);
        System.out.println("The sum N numbers is : "+Sum);
    }
}