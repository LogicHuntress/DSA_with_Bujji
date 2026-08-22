/*https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
//pusedocode
START
INPUT ARR
LEFT = 0;
RIGHT = ARR.LENGTH - 1;
WHILE(LEFT < RIGHT)
IF(ARR[MID] > ARR[RIGHT])
LEFT = MID + 1
ELSE IF(ARR[MID] < ARR[RIGHT])
RIGHT = MID
ELSE 
RIGHT--
END IF LOOP
RETURN LEFT
END
*/
public class FindMinimuminRotatedSortedArrayII{
    public static void main(String[] args) {
        int[] arr = {1,3,5};
        int left = 0;
        int right = arr.length- 1;
        while(left < right){
            int mid = left + (right-left)/2;
            if(arr[mid] > arr[right]){
                left = mid + 1;
            }else if(arr[mid]< arr[mid]){
                right = mid;
            }else {
                right--;
            }
        }
        System.out.println("Find Minimum in Rotated Sorted Array : "+arr[left]);
    }
}