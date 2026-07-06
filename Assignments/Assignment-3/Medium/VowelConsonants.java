/*Java Program Vowel Or Consonant
 //pusedocode
 START
        ENTER THE CHAR
        INTPUT CHAR
        IF(CHAR == 'A' || CHAR == 'E' || CHAR == 'I' || CHAR == 'O' || CHAR == 'U') 
        PEINT VOWEL
        ELSE 
        CONSONANT
        END IF 
 END
*/
import java.util.Scanner;
public class VowelConsonants {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter charecter : ");
        char C = sc.next().charAt(0);

        if (C == 'A' || C == 'a' ||
            C == 'E' || C == 'e' ||
            C == 'I' || C == 'i' ||
            C == 'O' || C == 'o' ||
            C == 'U' || C == 'u') {
            System.out.println("Vowels");
        }else {
            System.out.println("Consonants");
        }
        System.out.println();
        sc.close();

    }
}