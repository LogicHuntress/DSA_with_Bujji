/*https://leetcode.com/problems/jump-game/description/
//pusedocode
START
    INPUT NUMS
    INPUT Max = 0;
    BOOLEAN RESULT = TRUE;
    FOR I = 0 TO NUMS.LEN
    IF([I] > MAX)
    RESULT = FALSE
    BREAK
    IF(I+NUMS[I] > MAX)
    MAX = I+NUMS[I]
    END LOOP IF
    RETURN TRUE
END
*/
public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int Maxeach = 0;
        boolean result = true;
        for(int i = 0; i<nums.length; i++){
            if(i>Maxeach){
                result = false;
                break;
            }
            if(i+nums[i] > Maxeach){
                Maxeach = i+nums[i];
            }
            
        }
        System.out.println("true");
    }
}