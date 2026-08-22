/*https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
//pusedocode
START
        INPUT NUMS
        TARGET
        BOOLEAN = TRUE
        LEFT = 0;
        RIGHT = NUMS.LENGTH - 1;
        WHILE(LEFT <= RIGHT)
        MID = LEFT + (RIGHT - LEFT)/2;
        IF(NUMS[MID] == TARGET)
        RETURN TRUE
        END IF
        IF(NUMS[LEFT] == NUMS[MID] && NUMS[MID] == NUMS[RIGHT])
        LEFT++
        RIGHT--
        END IF
        ELSE IF(NUMS[LEFT]) <= NUMS[MID]
        IF(NUMS[LEFT] <= TARGET && TARGET < NUMS[MID]) 
        RIGHT = MID - 1;
        ELSE 
        LEFT = MID + 1  END IF
        ELSE 
        IF(NUMS[MID] < TARGET && TARGET <= NUMS[MID])
        LEFT = MID + 1;
        ELSE 
        RIGHT = MID - 1;
        END IF ELSE IF  LOOP
        RETURN FALSE;
END
*/
public class SearchinRotatedSortedArrayII{
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        int target = 0;
        boolean use = true;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                use = true;
                break;
            }
            if(nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
            } else if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }else {
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        }
        System.out.println("Search : "+use);
        
    }
}