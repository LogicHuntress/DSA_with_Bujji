/*Write a function that returns all prime numbers between two given numbers.
//pusedocode
START
        ENTER START END VALUES
        INPUT START
        INPUT END
        CALL PRIMENUMBER(START,END)

        FUNCTION PRIMENUMBER(INT START.INT END)
        FOR I = START TO END
        IF(ISPRIME(I))
        PRINT I
        END LOOP
        END FUNCTION

        FUNCTION ISPRIME(NUM)
        COUNT = 0
        FOR J = 1 TO NUM
        IF(NUM % J)
        COUNT ++
        END LOOP 
        IF(COUNT == 2)
        PRINT PRIME
        ELSE 
        NOT PRIME 
        END IF

END
*/
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start and end values here : ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        Primenmber(start,end);
        sc.close();

    }
    static void Primenmber(int start, int end) {
        for (int i = start; i<=end; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }  
    }
    static boolean  isPrime(int num) {
        int count = 0;
        for (int j = 1; j<=num; j++){
            if(num % j == 0){
                count ++;
            }
        }
        if(count == 2){
            return true;
        } else{
            return false;
        }

        
    }
}