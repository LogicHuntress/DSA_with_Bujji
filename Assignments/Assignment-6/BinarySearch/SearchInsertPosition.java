/*https://leetcode.com/problems/search-insert-position/description/
//pusedocode
START
        INPUT MAT
        INPUT TAR = 9;
        INPUT COL = MAT.LENGTH;
        INPUT LEFT = 0;
        INPUT RIGHT = COL-1;
        WHILE(LEFT <= RIGHT)
        MID = LEFT+(RIGHT-LEFT)/2
        IF(MAT[MID] == TARGET)
        RETURN MID
        END IF
        IF(MAT[MID] < TARGET)
        LEFT = MID +1;
        END IF 
        IF(MAT[MID]>TARGET)
        RIGHT = MID - 1;
        END IF 
        RETURN LEFT
END

*/
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] mat = {1,3,5,6};
        int target = 2;

        int col = mat.length;
        int left = 0;
        int right = col-1;

        while(left <= right){
            int mid = left + (right - left) /2;

            if(mat[mid] == target){
            System.out.println("search :"+mid);
        }
        if(mat[mid] < target){
            left = mid + 1;
        }
        else {
            right = mid -1;
        }

        } 
        System.out.println("Search Insert Position : "+left);

    }
}