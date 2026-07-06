/* Factorial Program In Java
//psuedocode
START
        ENTER THE NUM
        INT N
        FACT = 1
        FOR I = 1 TO N
        FACT = FACT * I
        END LOOP
        OUTPUT FACT 
END
*/
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.print("Enter the N value : ");
        int N = In.nextInt();
        int fact = 1;
        for(int i = 1; i<=N; i++){
                fact *= i;
        }
        System.out.println("Factorial of the number : "+fact);
        In.close();
    }
}