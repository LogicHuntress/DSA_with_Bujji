/*https://leetcode.com/problems/valid-perfect-square/submissions/2114647772/
//pusedocde
START
    INPUT NUM 
    BOL USE = TRUE
    LEFT = 1
    RIGHT = NUM
    WHILE(LEFT <= RIGHT)
    MID = LEFT + (RIGHT - LEFT)/2
    IF(MID == NUM / MID && NUM % MID == 0)
    RETURN TRUE;
    ELSE IF (MID < NUM / MID)
    LEFT = MID + 1
    ELSE 
    RIGHT = MID -1 
    END IF LOOP
    PRINT FLASE
END

*/public class PerfectSqre {
    public static void main(String[] args) {
        int num = 16;
        boolean use = true;
        int left = 1;
        int right = num;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(mid == num / mid && num % mid == 0){
                System.out.println(true);
                return;
            } else if(mid < num / mid){
                left = mid + 1;

            }else {
                right = mid -1;
            }
        }
        System.out.println(false);
    }

}