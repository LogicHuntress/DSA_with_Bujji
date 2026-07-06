/*Palindrome number
//pusedocde
START
    ENTER N VALUE
    INPUT N
    REVERSE = 0
    WHILE(N>0)
    DIGIT = NUM % 10
    REVERSE = REVERSE * 10 + DIGIT
    N /= 10
    END WHILE LOOP 
    IF (REVERSE == ORIGINAL )
    PRINT PALINDROME
    ELSE
    NOT PALINDROME
    END IF
END 
*/
import java.util.Scanner;
public  class Palindrome{
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.println("Enter N value : ");
        int n = In.nextInt();
        int original = n;

        int reverse = 0;

        while(n > 0){
            int digit = n % 10;

            reverse = reverse * 10 + digit;

            n /= 10;

        }
        if(original == reverse){
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");
        }
        System.out.println();
        In.close();
    }
}