/*Define a method to find out if a number is prime or not.
//pusedocode
START
        ENTER THE NUMBER
        INPUT NUM
        CALL PRIME(NUM)
        FUNCTION PRIME (INT NUM)
        INT COUNT = 0
        FOR I = 1 TO NUM
        IF(NUM % I == NUM)
        COUNT ++;
        END FOR 
        IF(COUNT == 2)
        PRINT PRIME 
        ELSE
        NOT PRIME 
        END IF
END 
*/
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num value : ");
        int num = sc.nextInt();
        prime(num);
       sc.close();
    }
    static void prime(int num) {
        int count = 0;
        for(int i = 1; i<=num ; i++){
            if(num % i == 0){
                count ++;
            }
        }
        if(count == 2){
              System.out.println("Prime number");
        }else {
             System.out.println("Not Prime number");
        }
       
        
    }

}