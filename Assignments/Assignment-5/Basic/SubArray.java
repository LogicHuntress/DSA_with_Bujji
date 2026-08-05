/*https://leetcode.com/problems/maximum-subarray/description/
//pusedocode
START
    INPUT NUM
    CURRENT = 0
    MAX = INTEGER.MIN_VALUE;
    FOR I  = 0 TO NUM.LENGHT
    CURRENT += NUM[I];
    IF(CURRENT>MAX)
    MAX = CURRENT
    IF(CURRENT < 0)
    CURRENT = 0
    END IF 
    END LOOP
    PRINT MAX
END
*/public class SubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int current = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            current += nums[i];
            if(current > max){
                max = current;
            }
            else if (current < 0){
                current = 0;
            }
        }
        System.out.println("SubArray is : "+max);
    }
}