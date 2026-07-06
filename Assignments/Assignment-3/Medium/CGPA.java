/* Calculate Average Marks

START

ENTER NUMBER OF SUBJECTS
INPUT N

SUM = 0

FOR I = 1 TO N
    ENTER MARKS
    INPUT SEM
    SUM = SUM + SEM
END FOR

CGPA = SUM / N

OUTPUT CGPA

END


*/
import java.util.Scanner;
public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How many subjects : ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1; i<=n; i++){
            System.out.print("Enter subject marks  " +i+" : ");
            

            double sem = sc.nextDouble();

            sum += sem;

        }
        float CGPA = (float)sum/n;
        System.out.println("Average Marks :"+CGPA);
        sc.close();
    }
}