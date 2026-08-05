/*https://leetcode.com/problems/number-of-good-pairs/submissions/2077719430/
//pusedocode
START

INPUT nums

COUNT = 0

FOR every index i in nums

    FOR every index j after i

        IF nums[i] == nums[j]

            COUNT++

        END IF

    END LOOP

END LOOP

RETURN COUNT

END
*/
public class NumberOfPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    System.out.println("Indicies: "+i+ " "+j);
                     System.out.println("Values: "+nums[i]+ " "+nums[j]);
                    count++;
                }
            }
            
        }
       
    }
}