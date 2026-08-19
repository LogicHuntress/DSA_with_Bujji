/*https://leetcode.com/problems/binary-search/
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
END

*/
public class BinarySearch {
    public static void main(String[] args) {
        int[] mat = {-1,0,3,5,9,12};
        int target = 9;

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

    }
}