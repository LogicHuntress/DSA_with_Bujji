/*Take two numbers and print the sum of both.
//pusedocode
START
    ENTER NUMBERS :
    INPUT A
    INPUT B
    SUM(A,B)
    FUNCTION SUM(INT A,INT B)
    INT SUM = A+B
    PRINT SUM
    END FUNCTION
END
*/
import java.util.Scanner;
public  class sum {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbers : ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    sum(a,b);

    sc.close();
   }
   static void sum(int a, int b) {
    int sum = (a+b);
    System.out.println("Sum : "+sum);
    
  }
}
