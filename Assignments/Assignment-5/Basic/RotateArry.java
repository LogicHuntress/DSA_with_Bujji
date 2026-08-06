/*https://leetcode.com/problems/rotate-array/description/
//pusedocode
START
INPUT NUMS
INT N= NUMS.LENGTH
INT K = K % N;

CALLING FUNCTION

REVERSE(NUMS,0,N-1);
REVERSE(NUMS,0,K-1);
REVERSE(NUMS,K,N-1);



FUNCTION (INT[] NUMS,INT LEFT, INT RIGHT)
WHILE (LEFT < RIGHT)
INT TEMP = NUMS[LEFT]
NUMS[LEFT] = NUMS[RIGHT]
NUMS[RIGHT] = TEMP

LEFT++;
RIGHT--
END LOOP 
END FUNCTION


*/
public class RotateArry {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int n = nums.length;
        int k = 3;
        k = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);

    }

    
    static void reverse(int[]nums, int left, int right) {

        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
            for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        
    }
}