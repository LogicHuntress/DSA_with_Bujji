/*https://leetcode.com/problems/search-a-2d-matrix/description/
//pusedocde
START

READ matrix and target

rows = matrix.length
columns = matrix[0].length

left = 0
right = rows * columns - 1

WHILE left <= right

    mid = left + (right - left) / 2

    row = mid / columns
    column = mid % columns

    IF matrix[row][column] == target
        RETURN true

    ELSE IF matrix[row][column] < target
        left = mid + 1

    ELSE
        right = mid - 1

RETURN false

END
*/
public class Searcha2DMatrix{
    public static void main(String[] args) {
        int[][] mat = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };

        int target = 3;

        int row = mat.length;
        int col = mat[0].length;

        int left = 0;
        int right = row * col -1;

        boolean found = true;

        while(left <= right){
            int mid = left + (right - left) / 2;

            int r = mid / col;
            int c = mid % col;

            if(mat[r][c] == target){
                found = true;
                break;
            } else if (mat[r][c] < target){
                left = mid + 1;
            } else {
                right = mid -1;
            }

        }
        System.out.println("target Found : "+found);
    }

}