/*https://leetcode.com/problems/shuffle-the-array/submissions/2083006495/
//pusedocode
START

INPUT nums
INPUT n

CREATE answer array

index = 0

FOR i = 0 TO n-1

    answer[index] = nums[i]

    index++

    answer[index] = nums[i+n]

    index++

END LOOP

RETURN answer

END
*/
import java.util.Arrays;
public class ShuffleArray {
    public static  void main(String[] args){
        int[] nums = {2,5,1,3,4,7};
        int n = nums.length/2;
        int[] ans = new int[nums.length];
        int index = 0;
        for(int i = 0; i<n; i++){
            ans[index] = nums[i];
            index++;
            ans[index] = nums[i + n];
            index++;
        }
        System.out.println(Arrays.toString(ans));


    }
}