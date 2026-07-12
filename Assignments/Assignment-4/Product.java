/* Define a method that returns the product of two numbers entered by user.
//pusedocode
START
    ENTER THE VALUES 
    INPUT A, B
    CALL PRODUCT(A,B)
    PRODUCT = A+B
    PRINT PRODUCT
    END FUNCTION 
END
*/
import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        product(a, b);
        sc.close();
    }
    static void product(int a, int b) {
        int product = 0;
        product = (a * b);
        System.out.println("The product is : "+product);
    }
}