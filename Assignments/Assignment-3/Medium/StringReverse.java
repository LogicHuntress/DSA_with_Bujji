 /* Reverse String Program

// Pseudocode

START

    ENTER THE STRING
    INPUT STRING

    REVERSE = ""

    FOR I = STRING.LENGTH() - 1 TO 0

        REVERSE = REVERSE + STRING.CHARAT(I)

    END LOOP

    OUTPUT REVERSE

END
*/
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s = in.nextLine();

        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }

        System.out.println("Reverse String : " + reverse);

        in.close();
    }
}