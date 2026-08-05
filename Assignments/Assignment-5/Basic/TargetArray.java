/*TargetArray
//pusedocode
START

INPUT nums
INPUT index

CREATE target list

FOR i = 0 TO nums.length-1

    INSERT nums[i] AT position index[i]

END LOOP

RETURN target

END
*/
import java.util.Arrays;
public class TargetArray {
    public static void main(String[] args) {
        
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] target = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            target[index[i]] = nums[i];
        }
        System.out.println(Arrays.toString(target));
    }
}