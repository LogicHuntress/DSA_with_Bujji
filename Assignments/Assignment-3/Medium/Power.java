/*Power In Java
//pusedocode
START
        ENTER THE BASE AND POWER VALUES 
        INPUT BASE
        INPUT POWER
        RESULT = 1
        FOR I = 1 TO POWER
        RESULT *= BASE
        END LOOP
        OUTPUT
        PRINT RESULT
END

*/
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
       Scanner In = new Scanner(System.in);
       System.out.print("Enter the base and power values : ");
       
       int base = In.nextInt();
       int power = In.nextInt();
       int result = 1; // assume

       for(int i = 1; i<=power; i++){
        result *= base;
       }
       System.out.println("Power of number : "+result);
       In.close();

    }
}