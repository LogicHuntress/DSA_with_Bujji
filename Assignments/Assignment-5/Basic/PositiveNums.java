/*https://leetcode.com/problems/first-missing-positive/
//pusedocode
START
    INPUT NUMS
    FOR I = 0 TO NUMS.LENGTH
    INT CORRECTINDEX = NUMS[I]-1
    IF(NUMS[I] > 0 && NUMS[I] < = NUMS.LENGTH 
    && NUMS[I] != NUMS[CORRECTINDEX])
    TEMP = NUMS[I]
    NUMS[I] = NUMS[CORRECTINDEX]
    NUMS[CORRECTINDEX] = TEMP
    END IF END LOOP
    FOR J = 0 TO NUMS.LENGTH
    IF(NUMS[J] != J+1)
    PRINT J+1;
    END  IF AND LOOP
    PRINT NUMS.LENGTH+1
 END


*/
public  class PositiveNums {
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int i = 0;
        
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] > 0 && nums[i] <= nums.length 
            && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else {
                i++;
            }
          
            }
        
        for(int j = 0; j<nums.length; j++){
            if(nums[j] != j+1){
                System.out.println(j+1);
                return;
            }
        }
        System.out.println(nums.length+1);

    }
}