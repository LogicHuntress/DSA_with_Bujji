/*PluSone
//pusedocode
START
        INPUT NUM
        ARRALIST RESULT
        K = 1
        INT I = NUMS.LENGTH-1;
        WHILE(I>=0 || K>0)
        IF(I>=0)
        K+=NUMS[I]
        END IF
        RESULT.ADD(K%10)
        K /= 10 
        I--
        END LOOP
        COLLECTIONS.REVERSE(RESULT)
        PRINT RESULT
 END
*/

import java.util.*;
public class PlusOne{
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 1;
        List<Integer> result = new ArrayList<>();
        int i = nums.length-1;
        while(i>=0 || k>0){
            if(i>=0){
                k+=nums[i];
            }
            result.add(k%10);
            k /= 10;
            i--;
        }
        Collections.reverse(result);
        System.out.println(result);
    }

}