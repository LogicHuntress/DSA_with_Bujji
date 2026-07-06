/* Calculate Average Marks

START

ENTER NUMBER OF SUBJECTS
INPUT N

SUM = 0

FOR I = 1 TO N
    ENTER MARKS
    INPUT MARKS
    SUM = SUM + MARKS
END FOR

AVERAGE = SUM / N

OUTPUT AVERAGE

END


*/
import java.util.Scanner;
public class Avgmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How many subjects : ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1; i<=n; i++){
            System.out.print("Enter subject marks  " +i+" : ");
            

            int num = sc.nextInt();

            sum += num;

        }
        float avg = (float)sum/n;
        System.out.println("Average Marks :"+avg);
        sc.close();
    }
}