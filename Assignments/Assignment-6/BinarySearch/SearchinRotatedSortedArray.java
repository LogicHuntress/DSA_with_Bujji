/*https://leetcode.com/problems/search-in-rotated-sorted-array/description/
//pusedocde
START

left = 0
right = length - 1

WHILE left <= right

    mid = left + (right - left) / 2

    IF nums[mid] == target
        RETURN mid

    IF left half is sorted
        IF target is between nums[left] and nums[mid]
            right = mid - 1
        ELSE
            left = mid + 1

    ELSE
        IF target is between nums[mid] and nums[right]
            left = mid + 1
        ELSE
            right = mid - 1

RETURN -1

END
*/
public class SearchinRotatedSortedArray {
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                System.out.println("Index: " + mid);
                break;
            }
            if(arr[left] <= arr[mid]){
                if(arr[left] <= target && target < arr[mid]){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }

            } else {
                if(arr[mid] < target && target <= arr[right]){
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        }
        

    }
}