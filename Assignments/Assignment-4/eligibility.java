/*A person is eligible to vote if his/her age is greater than or equal to 18. 
Define a method to find out if he/she is eligible to vote.
//PUSEDOCODE
START
        ENTER THE VALUE
        INPUT AGE
        CALL ELIGIBILITY(AGE)
        FUNCTION ELIGIBILITY(INT AGE)
        IF(AGE >= 10)
        PRINT ELIGIBLE
        ELSE
        NOT ELIGIBLE
        END IF
END
*/
import java.util.Scanner;
public class eligibility {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the age value : ");
            int age = sc.nextInt();
            eligibility(age);
            sc.close();
        }
        static void eligibility(int age) {
                if(age >= 18){
                        System.out.println("you are eligible");
                }else {
                        System.out.println("you are not eligible");
                }

            
        }
}