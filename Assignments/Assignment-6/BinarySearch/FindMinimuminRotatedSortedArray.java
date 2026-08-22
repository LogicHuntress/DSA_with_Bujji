/*https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
//pusedocode
START
INPUT ARR
LEFT = 0;
RIGHT = ARR.LENGTH - 1;
WHILE(LEFT < RIGHT)
IF(ARR[MID] > ARR[RIGHT])
LEFT = MID + 1
ELSE 
RIGHT = MID
END IF LOOP
RETURN LEFT
END
*/public class FindMinimuminRotatedSortedArray{
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int left = 0;
        int right = arr.length- 1;
        while(left < right){
            int mid = left + (right-left)/2;
            if(arr[mid] > arr[right]){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        System.out.println("Find Minimum in Rotated Sorted Array : "+arr[left]);
    }
}