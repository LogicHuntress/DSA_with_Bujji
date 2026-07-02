/*To find out whether the given String is Palindrome or not.

START

INPUT STRING

REVERSE = ""

FOR last character TO first character

    ADD character TO REVERSE

END FOR

IF ORIGINAL equals REVERSE

    PRINT "Palindrome"

ELSE

    PRINT "Not Palindrome"

END IF

END

*/

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner Sr = new Scanner(System.in);

        System.out.print("Enter string name: ");

        String S = Sr.nextLine();

        String reverse = "";

        for(int i = S.length()-1; i>=0; i--){
            reverse = reverse+S.charAt(i);
        }
            if(S.equals(reverse)){
                System.out.println("palindrome");
            } else {
                System.out.println("not palindrome");
            }
            
        
        System.out.println();
        Sr.close();
    }
}