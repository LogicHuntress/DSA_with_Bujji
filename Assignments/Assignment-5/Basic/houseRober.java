/*https://leetcode.com/problems/house-robber/
//pusedocode
START

INPUT nums

CREATE dp array of nums length

dp[0] = nums[0]

dp[1] = MAX(nums[0], nums[1])


FOR i = 2 TO nums.length - 1

    TAKE = nums[i] + dp[i-2]

    SKIP = dp[i-1]

    dp[i] = MAX(TAKE, SKIP)

END LOOP


RETURN dp[nums.length - 1]

END
*/
public class houseRober {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i<nums.length; i++){
            int take = nums[i] + dp[i-2];
            int skip = dp[i-1];
            dp[i] = Math.max(take,skip);
        }
         System.out.println(dp[nums.length-1]);
    }
    

}