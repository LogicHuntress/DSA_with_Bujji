/*Amstrong number
//pusedocde
START
    ENTER N VALUE
    INPUT N
    REVERSE = 0
    ORIGINAL = N
    WHILE(N>0)
    DIGIT = NUM % 10
    SUM = SUM+DIGIT*DIGIT*DIGIT
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
public  class Amstrong {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.println("Enter N value : ");
        int n = In.nextInt();
        int original = n;

        int Sum = 0;

        while(n > 0){
            int digit = n % 10;

            Sum +=  (digit*digit*digit);

            n /= 10;

        }
        if(original == Sum){
            System.out.println("Amstrong");
        }else{
            System.out.println("Not Amstrong");
        }
        System.out.println();
        In.close();
    }
}