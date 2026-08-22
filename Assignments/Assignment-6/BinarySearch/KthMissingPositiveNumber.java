/*https://leetcode.com/problems/kth-missing-positive-number/description/
//pusedocde
START
    INPUT ARR
    INPUT K 
    INPUT LEFT = 0;
    RIGHT = ARR.LENGTH -1 
    WHILE(LEFT <= RIGHT)
    MID = LEFT + (RIGHT - LEFT)/2
    COUNT = ARR[MID] - (MID+1)
    IF(COUNT < K)
    LEFT = MID + 1
    ELSE
    RIGHT = MID -1
    END IF LOOP
    PRINT LEFT + K
END
*/
public class KthMissingPositiveNumber{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 2;
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            int count = arr[mid] - (mid+1);
            if(count < k){
                left = mid + 1;

            }else {
                right = mid - 1;
            }
        }
        System.out.println("Kth Missing Positive Number : "+(left+k));
    }
}
