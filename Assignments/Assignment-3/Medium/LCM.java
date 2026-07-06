/*LCM Of Two Numbers Program
 //pusedocode
 START
        ENTER THE NUM1 ND NUM2 VALUES
        NUM1
        NUM2
        LIMIT
        LCM = 1
        IF(NUM1 < NUM2)
        PRINT LIMIT = NUM1
        ELSE
        PRINT LIMIT = NUM2
        FOR I = 1 TO LIMIT 
        IF(NUM1 % I == 0 OR NUM2 % I == 0)
        PRINT LCM = I;
        OUTPUT LCM
        END IF
        END LOOP
        END IF
 END


*/
import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num1 and num2 values : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int limit;
        int LCM = 1;

        if(num1 > num2){
            limit = num1;
        }else {
            limit = num2;
        }
        for(int i = limit; i<= num1 * num2; i++){
            if(i % num1 == 0 && i % num2 == 0){
                LCM = i;
                break;
                
            }
        }
        System.out.println("LCM of number : " +LCM);
        
        sc.close();
    }
}
