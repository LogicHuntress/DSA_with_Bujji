/*MaximumProduct
//pusedocode
START

INPUT nums

MAX = 0

FOR I = 0 TO length-1

    FOR J = I+1 TO length-1

        PRODUCT = (nums[I]-1) * (nums[J]-1)

        IF PRODUCT > MAX
             MAX = PRODUCT

RETURN MAX

END
*/
public class MaximumProduct {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        
        int product = 0;
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                product = ((nums[i]-1) * (nums[j]-1));
                if(product > max){
                max = product;
            }
            }
            
        }
        System.out.println(max);
    }
}