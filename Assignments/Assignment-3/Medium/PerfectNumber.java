/*Perfect Number In Java
 //pusedocode
 START
        ENTER THE NUMBER
        INPUT NUM
        SUM = 0
        FOR I = 1 TO NUM
        IF(NUM % I == 0)
        SUM += I
        PRINT PERFECT
        ELSE
        PRINT NOT PERFECT
        END LOOP
        END IF
 END


*/
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.print("Enter num value : ");
        int num = In.nextInt();

        int sum = 0;

        for(int i = 1; i<num; i++){
            if(num % i == 0){
                sum += i;
                
            } 
            
        }
        if(sum == num){
            System.out.println("perfecr number : "+sum);
        } else {
            System.out.println("not perfect number");
        }
        
        In.close();
    }
}