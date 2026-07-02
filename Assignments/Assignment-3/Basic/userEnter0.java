/* Sum until user enters 0

//pusedocde

        START

        SUM = 0

        WHILE(TRUE)

        INPUT NUM

        IF(NUM == 0)

        STOP LOOP

        SUM = SUM + NUM

        END WHILE

        PRINT SUM

END
*/
import java.util.Scanner;

public class userEnter0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num value : ");
        
        
        int sum = 0;

        while(true){
            int num = sc.nextInt();
            if(num == 0){
                break;

            }
            sum = sum +num;
            
        }
        System.out.println(sum);
        sc.close();
        

    }
}