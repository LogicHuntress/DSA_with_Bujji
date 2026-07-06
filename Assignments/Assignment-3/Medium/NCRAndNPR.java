/*NCR & NPR
//pusedocode of NPR
START

ENTER N
ENTER R

FACTN = 1
FACTR = 1
FACTNR = 1

FOR I = 1 TO N
    FACTN *= I

FOR I = 1 TO R
    FACTR *= I

FOR I = 1 TO (N-R)
    FACTNR *= I

NPR = FACTN / FACTNR

NCR = FACTN / (FACTR * FACTNR)

PRINT NPR
PRINT NCR

END

*/
import java.util.Scanner;
public class NCRAndNPR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N ,R values : ");
        int N = sc.nextInt();
        int R = sc.nextInt();

        int FACTN = 1;
        int FACTR = 1;
        int FACTNR = 1;
        

        for(int i = 1; i<=N; i++){
            FACTN *= i;
        }
        for(int i = 1; i<=R; i++){
            FACTR *= i;
        }
        for(int i = 1; i<=(N-R); i++){
            FACTNR *= i;
        }
        int NPR = (FACTN/FACTNR);
        int NCR = FACTN / (FACTR * FACTNR);
        System.out.println("NPR is : " +NPR);
        System.out.println("NCR is : " +NCR);
        sc.close();
    }
    
}