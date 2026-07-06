/*Sum Of Digits Of Number
//psuedocode
START
        ENTER THE NUM 
        INTPUT NUM
        SUM  = 0
        WHERE(NUM > 0)
        DIGIT = NUM % 10
        NUM /= 10
        SUM += DIGIT
        END WHILE
        OUTPUT SUM
END

*/
import java.util.Scanner;
public class SumofNdigit {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the num value : ");
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            
            sum += digit;

            num /= 10;
        }
        System.out.println("Sum Of Digits Of Number : "+sum);
        sc.close();
    }
}