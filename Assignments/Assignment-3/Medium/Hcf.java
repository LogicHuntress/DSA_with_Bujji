/*HCF Of Two Numbers Program
 //pusedocode
 START
        ENTER THE NUM1 ND NUM2 VALUES
        NUM1
        NUM2
        LIMIT
        HCF = 1
        IF(NUM1 > NUM2)
        PRINT LIMIT = NUM1
        ELSE
        PRINT LIMIT = NUM2
        FOR I = 1 TO LIMIT 
        IF(NUM1 % I == 0 OR NUM2 % I == 0)
        PRINT HCF = I;
        OUTPUT HCF
        END IF
        END LOOP
        END IF
 END


*/
import java.util.Scanner;
public class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num1 and num2 values : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int limit;
        int HCF = 1;

        if(num1 < num2){
            limit = num1;
        }else {
            limit = num2;
        }
        for(int i = 1; i<=limit; i++){
            if(num1 % i == 0 && num2 % i == 0){
                HCF = i;
            }
        }
        System.out.println("HCf of number : " +HCF);
        sc.close();
    }
}
