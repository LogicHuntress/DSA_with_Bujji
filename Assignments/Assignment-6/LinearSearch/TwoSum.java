import java.util.*;
/*https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/2110349026/
//pusedocode
START
    INPUT NUMBERS
    INPUT TARGET 
    INPUT ANS 2
    INPUT LEFT = 0;
    INPUT RIGHT = NUMBER.LENGTH-1;
    WHILE(LEFT < RIGHT)
    INT SUM = NUM[LEFT]+NUM[RIGHT];
    IF(SUM == TARGET)
    ANS[0] = LEFT + 1
    ANS[1] = RIGHT + 1
    RETURN ANS
    END IF
    IF(SUM < TARGET)
    LEFT ++
    ELAE RIGHT --
    END IF AND LOOP
    PRINT ANS 
END


*/public class TwoSum {
    public static void main(String[] args) {
        int[] num = {2,7,11,15};
        int target = 9;
        int[] ans = new int[2];

        int left = 0;
        int right = num.length -1;

        while(left < right){
            int sum = num[left]+num[right];
            if(sum == target){
                ans[0] = left + 1;
                ans[1] = right + 1;
                
            }
            if(sum < target){
                left++;
            } else {
                right--;
            }
        }
        System.out.println("TwoSum is :" + Arrays.toString(ans));
        
    }
}