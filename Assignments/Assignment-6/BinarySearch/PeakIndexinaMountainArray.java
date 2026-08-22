/*https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
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
*/
public class PeakIndexinaMountainArray{
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
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