/*Addition Of Two Numbers

// pusedocode
START
    ENTER TWO NUMS 
    INPUT 1
    INPUT 2
    ADDITION = 1 + 2
    OUTPUT ADDITION 
END
*/
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int a = in.nextInt();
        int b  = in.nextInt();

        int Addition = (a+b);

        System.out.println("Addition of two numbers is : " + Addition);
        in.close();
    }
}