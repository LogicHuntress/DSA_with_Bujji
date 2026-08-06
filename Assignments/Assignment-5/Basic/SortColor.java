/*https://leetcode.com/problems/sort-colors/submissions/2095420804/
//pusedocode
START
    INPUT NUMS
    INT LOW = 0
    INT MID = 0
    INT HIGH = NUMS.LEN-1
    WHILE (MID <= HIGH)
    IF(NUMS[MID] == 0)
    INT TEMP = NUMS[LOW]
    NUMS[LOW] = NUMS[MID]
    NUMS[MID] = TEMP

    LOW++
    MID++
    END IF 
    ELSE IF(NUMS[MID] == 1)
    MID++
    END ELSE IF
    ELSE
    INT TEMP = NUMS[MID]
    NUMS[MID] = NUMS[HIG]
    NUMS[HIGH] = TEMP
    HIGH--
    END ELSE
    END WHILE
END
*/
public class SortColor {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high]= temp;

                high--;
            }

        }
        for(int i = 0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}