/*https://leetcode.com/problems/product-of-array-except-self/description/
//pusedocode
START
    INPUT NUMS
    INPUT ANS SAME LEN OF NUMS
    INPUT  LEFT = 1
    INPUT RIGHT = 1
   
    FOR I = 0 TO NUMS.LENGTH
    ANS[I] = LEFT
    LEFT = LEFT * NUMS[I];
    END LOOP 
    FOR I = NUMS.LENGTH-1; I<0
    ANS[I] = ANS[I] * RIGHT

    RIGHT = RIGHT * NUMS[I]
    END LOOP
    END LOOP
    RETURN ANS 
END

*/
public class ProductOfArry {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = new int[nums.length];
        
        
            int left = 1;
            for(int j = 0; j<nums.length; j++){
                ans[j] = left;
                left = left * nums[j];
            }
            int right = 1; 
            for(int k = nums.length-1; k>=0; k--){
                ans[k] = ans[k] * right;
                right = right * nums[k];

            }
        
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}