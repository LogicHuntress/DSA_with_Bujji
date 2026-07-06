/*Calculate Batting Average
//pusedocode
START
    ENTER THE RUNS AND OUT VALUES :
    INPUT 1 RUN
    INPUT 2 OUT
    AVG = RUN/OUT
    OUTPUT
    PRINT AVG
END

*/
import java.util.Scanner;
public class BattingAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the runs and out values : ");
        int run = sc.nextInt();
        int out = sc.nextInt();

        double Avg = (run/out);

        System.out.println("Batting Average : "+Avg);
        sc.close();
    }
}