/*https://leetcode.com/problems/two-sum/
//pusedocode
START

INPUT nums
INPUT target

FOR i = 0 TO nums.length-1

    FOR j = i+1 TO nums.length-1

        IF nums[i] + nums[j] == target

            RETURN [i,j]

END

END
*/
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        for(int i = 0; i<=nums.length-1; i++){
            for(int j = i+1; j<=nums.length-1; j++){
                if(nums[i]+nums[j] == target){
                    System.out.println("Indices : " + i + " " + j);
                 System.out.println("Values  : " + nums[i] + " " + nums[j]);
                }
            }
        }
        
    }
}