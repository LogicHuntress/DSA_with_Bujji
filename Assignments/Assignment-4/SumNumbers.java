/*Write a function that returns the sum of first n natural numbers.
//pusedocode
START
        ENTER THE NUMBERS
        INPUT NUM
        CALL SUM(NUM)
        FUNCTION SUM (INT NUM)
        SUM = 0
        FOR I = 1 TO NUM
        SUM +=I
        END LOOP 
        END FUN
END

*/
import java.util.*;
public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers here : ");
        int num = sc.nextInt();
        Sum(num);
        sc.close();
    }
    static void Sum(int num) {
        int sum = 0;
        for(int i = 1; i<=num; i++){
            sum += i;
            
        }
        System.out.println("Sum : "+sum);
        
    }
}