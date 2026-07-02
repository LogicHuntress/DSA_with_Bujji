/*Largest Number until user enters 0

//pusedocde

        START

        SUM = 0

        WHILE(TRUE)

        INPUT NUM

        IF(NUM == 0)

        STOP LOOP

        IF(NUM > MAX)

        MAX = NUM

        END WHILE

        PRINT MAX

END

 */
import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num value : ");
        
        
        int max = 0;

        while(true){
            int num = sc.nextInt();
            if(num == 0){
                break;

            }
            if(num > max){
                max = num;
            }
            
            
        }
        System.out.println("The largest num is : "+max);
        sc.close();
        

    }
}