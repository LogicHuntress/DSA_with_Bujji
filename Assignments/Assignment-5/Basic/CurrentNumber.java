/*https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
//pusedocode
START

INPUT nums

CREATE ans[]

FOR i = 0 TO nums.length

    COUNT = 0

    FOR j = 0 TO nums.length

        IF nums[j] < nums[i]

            COUNT++

    END LOOP

    ans[i] = COUNT

END LOOP

RETURN ans

END
*/
public class CurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] ans = new int[nums.length];
        
        
        for(int i = 0; i<nums.length; i++){
            int count = 0;
          
          for(int j = 0; j<nums.length; j++){
            if(nums[j] < nums[i]){
                count++;
            }
          }
          ans[i] = count;
        }
        for(int i = 0; i<ans.length; i++){
             System.out.print(ans[i]+ " ");
        }

       
    }
}