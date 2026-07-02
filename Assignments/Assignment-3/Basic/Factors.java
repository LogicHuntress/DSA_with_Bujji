/*Print all Factors
//psuedocode
START
        ENTER NUM
        INPUT N
        FOR I = 1 TO N
        IF N%1 == 0
        OUTPUT I
        END IF
        END FOR
END

*/
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
        System.out.println();
        sc.close();
    }
}