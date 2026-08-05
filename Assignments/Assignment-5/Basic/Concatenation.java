/* https://leetcode.com/problems/concatenation-of-array/submissions/2069412328/
//pusedocode
START
        ENTER THE NUM VALUES
        INPUT NUMS
        ANS = 2 *NUMS.LENGTH

        FOR I = 0 TO NUMS.LENGTH
        ANS[I] = NUMS[I];
        ANS[I + NUMS.LENGTH] = NUMS[I]
        END LOOP
        RETURN ANS
END 

*/
import java.util.Scanner;
public class Concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num values here : ");
        int[] nums = new int[3];
        for(int i = 0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        int[] ans =  Concatenation(nums);

        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
        sc.close();   

    }
    static int[] Concatenation(int[] nums){
        int[] ans = new int[2 * nums.length];
        for(int i = 0; i<nums.length; i++){
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
    
}
