/*https://leetcode.com/problems/running-sum-of-1d-array/description/
//pusedocode
START
    ENTER NUM VALUES
    INPUT[] NUM
    RUNNINGSUM[0] = NUM[0]
    FOR I = 1 TO NUM.LENGTH
    RUNNINGSUM = RUNNINGSUM[I - 1] + NUM[I]
    END LOOP
    RETURN RUNNINGSUM
END

*/
import java.util.Scanner;
public class RunningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num values : ");
        int[] nums = new int[4];
        for(int i = 0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        int[] runningSum = RunningSum(nums);

        for(int i = 0; i<runningSum.length; i++){
            System.out.print(runningSum[i]+ " ");
        }
        sc.close();
        
    }
    static int[] RunningSum(int[] nums){
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        for(int i = 1; i<nums.length; i++){
            runningSum[i] = runningSum[i - 1] + nums[i];
        }
        return runningSum;

    }
}