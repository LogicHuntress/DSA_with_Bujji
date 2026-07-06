/* Average of N Numbers

//psuedocode
START

    ENTER HOW MANY NUMBERS
    INPUT N

    SUM = 0

    FOR I = 1 TO N
        ENTER A NUMBER
        INPUT NUM

        SUM = SUM + NUM
    END FOR

    AVG = SUM / N

    OUTPUT AVG

END


*/
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.print("Enter How many values : ");
        int N = In.nextInt();
        int sum = 0;
        for(int i = 1; i<=N; i++){
                System.out.print("Enter the numbers : ");
                int num = In.nextInt();
                sum +=num;
        }
        int Avg = sum/N;
        System.out.println("Average of N Numbers : "+Avg);
        In.close();
    }
}