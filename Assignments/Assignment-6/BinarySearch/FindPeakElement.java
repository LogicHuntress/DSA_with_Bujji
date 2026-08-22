/*https://leetcode.com/problems/find-peak-element/description/
//pusedocde
START
    INPUT ARR
    LEFT = 0
    RIGHT = ARR.LENGTH-1
    WHIEL(LEFT < RIGHT)
    MID = LEFT+(RIGHT - LEFT)/2;
    IF(ARR[MID] < ARR[MID+1])
    LEFT = MID + 1
    ELSE 
    RIGHT = MID
    END IF LOOP
    PRINT LEFT
END
Both problems can use the same Binary Search strategy because 
the decision depends on the slope between mid and mid + 1. 
If nums[mid] < nums[mid + 1], we are on an increasing slope, 
so a peak must exist on the right. If nums[mid] > nums[mid + 1], 
we are on a decreasing slope, so a peak is at mid or on the left. 
Therefore, we can eliminate half of the search space in every iteration.


*/public class FindPeakElement{
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int mid = left + (right-left)/2;
            if(arr[mid] < arr[mid+1]){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        System.out.println("Peak Index in a Mountain Array : "+left);
    }

}