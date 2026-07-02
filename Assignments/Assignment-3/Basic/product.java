/*Subtract the Product and Sum of Digits of an Integer

// psuedocode
START
        ENTER THE INPUT VALUE
        PRODUCT = 1
        ANSWER = 0
        SUM = 0
        INPUT NUM
        WHILE(NUM>0)
        REM = NUM % 10
        PRODUCT = PRODUCT *DIGIT
        SUM = SUM + DIGIT
        NUM /= 10
        END WHILE
        ANSWER = PRODUCT-SUM
        OUTPUT ANSWER
END



*/
import java.util.Scanner;
public class product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        int product = 1;
        int sum = 0;
       

        while(n > 0){
            int digit = n % 10;
            product = product * digit;
            sum = sum + digit;
            n /= 10;

        }
        System.out.println("The product is : "+product);
        System.out.println("The sum is : "+sum);

         int Ans = product - sum;

        System.out.println("The Product and Sum of Digits of an Integer : "+Ans);
        in.close();

    }
}