/*Take 2 numbers as inputs and find their HCF and LCM.
//pusedocode
START

ENTER A
ENTER B

CALL HCF(A, B)

CALL LCM(A, B)

FUNCTION HCF(A, B)

HCF = 1

FOR I = 1 TO SMALLER NUMBER

IF(A % I == 0 AND B % I == 0)

HCF = I

PRINT HCF

END FUNCTION

FUNCTION LCM(A, B)

LCM = (A * B) / HCF

PRINT LCM

END FUNCTION

END
*/
import java.util.Scanner;

public class HcfLcm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int hcfValue = hcf(a, b);

        System.out.println("HCF = " + hcfValue);

        lcm(a, b);

        sc.close();
    }

    // Function to find HCF
    static int hcf(int a, int b) {

        int hcf = 1;
        int min = Math.min(a, b);

        for (int i = 1; i <= min; i++) {

            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }

        }

        return hcf;
    }

    // Function to find LCM
    static void lcm(int a, int b) {

        int hcfValue = hcf(a, b);

        int lcm = (a * b) / hcfValue;

        System.out.println("LCM = " + lcm);

    }
}