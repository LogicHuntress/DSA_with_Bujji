/*https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
//pusedocode
START
    INPUT NUM
    INPUT TARGET
    START = 0;
    END = NUMS.LENGTH-1;
    ANS = -1;
    WHILE(START <= END)
    MID = START+END/2
    IF(NUM[MID] == TARGET)
    ANS = MID
    END = MID-1
    else IF(NUM[MID] == TARGET)
    ANS = MID
    START = MID+1
    IF(NUM[MID] < TARGET)
    START = MID +1
    ELSE
    END = MID-1
    END IF LOOP
    PRINT ANS
END
*/
public class FirstLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int start = 0;
        int end = nums.length-1;
        int[] ans = {-1,-1};
        int mid = 0;

        //left value 
        while(start <= end){
            mid = start+(end-start)/2;

            if(nums[mid] == target){
                ans[0] = mid;
                end = mid-1; 
            }
            else if(nums[mid] < target){
                start = mid + 1; 
            } else {
                end = mid-1;
            }
        }

        // last value
        start = 0;
        end = nums.length - 1;
        while(start <= end){
            mid = start+(end-start)/2;

            if(nums[mid] == target){
                ans[1] = mid;
                start = mid+1; 
            }
            else if(nums[mid] < target){
                start = mid + 1; 
            } else {
                end = mid-1;
            }
        }
        System.out.println("First = " + ans[0]);
        System.out.println("Last = " + ans[1]);
        


    }
}