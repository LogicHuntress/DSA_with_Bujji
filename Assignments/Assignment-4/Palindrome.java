/*Write a function to find if a number is a palindrome or not. Take number as parameter.
//pusedocode
START
ENTER NUMBER
INPUT NUM
        INPUT ORIGINAL = NUM
        INPUT REVERSE
        CALL PALIN(NUM)

        FUNCTION PALIN(INT NUM)
        WHILE(NUM > 0)
        INT DIGIT = NUM % 10
        REVERSE = REVERSE * 10 + DIGIT
        NUM /= 10
        IF(ORIGINAL == REVERSE)
        PRINT PALINDROME
        ELSE
        PRINT NOT PALINDROME
        END IF 
        END LOOP

        END FUNCTION
END


*/import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num value : ");
        int num = sc.nextInt();
        
        palin(num);

        sc.close();
    }
    static void palin(int num) {
        int reverse = 0;
        int Original = num;
        while(num > 0){
            int digit = num % 10;
            reverse = reverse * 10 +digit;
            num /= 10;
        }
        if(Original == reverse){
            System.out.println("Palindrome");

        }else{
            System.out.println("Not Palindrome");
        }
        
    }
}