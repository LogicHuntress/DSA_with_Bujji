/*https://leetcode.com/problems/find-the-highest-altitude/
//pusedocode
START

INPUT gain[]

CURRENT = 0
MAX = 0

FOR each value in gain

    CURRENT = CURRENT + gain[i]

    IF CURRENT > MAX

        MAX = CURRENT

END LOOP

RETURN MAX

END
*/
public class Altitude {
    public static void main(String[] args) {
        int[] gain = {-2,3,-1,2};
        int current = 0;
        int max = 0;
        for(int i = 0; i<gain.length; i++){
            current += gain[i];
            if(current > max){
                max = current;
            }
        }
        System.out.println(max);
    }
}