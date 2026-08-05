/*https://leetcode.com/problems/check-if-the-sentence-is-pangram/
//pusedocode
START
INPUT SEN
INPUT ATEN 

        FOR I = 0 TO SEN.LENGTH
        CHAR CH = SEN.CHATAT[I]
        INT INDEX = CH-'A'
        ATEN[INDEX] = 1
        END LOOP
        FOR I = 0 TO ATEN
        IF(ATEN[I] == 0)
        PRINT FALSE
        ELSE 
        PRINT TRUE
        END IF
        END LOOP 

END 

*/
public class Pangram {
    public static void main(String[] args) {

        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        int[] count = new int[26];

        for(int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            int index = ch - 'a';

            count[index]++;
        }

        boolean result = true;

        for(int i = 0; i < count.length; i++) {

            if(count[i] == 0) {
                result = false;
                break;
            }
        }

        System.out.println("Pangram: " + result);
    }
}