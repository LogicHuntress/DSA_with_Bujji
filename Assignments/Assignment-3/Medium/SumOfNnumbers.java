/* Sum of N Numbers

//psuedocode
START
        ENTER THE NUM
        INT N
        SUM = 0
        FOR I = 1 TO N
        SUM = SUM + I
        END LOOP
        OUTPUT SUM 
END


*/
import java.util.Scanner;
public class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.print("Enter the N value : ");
        int N = In.nextInt();
        int sum = 0;
        for(int i = 1; i<=N; i++){
                sum += i;
        }
        System.out.println("Sum of the number : "+sum);
        In.close();
    }
}