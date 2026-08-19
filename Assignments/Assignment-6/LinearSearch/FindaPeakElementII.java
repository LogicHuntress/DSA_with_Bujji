/*https://leetcode.com/problems/find-a-peak-element-ii/
//pusedocode 
START

READ matrix

rows = number of rows
cols = number of columns

left = 0
right = cols - 1

WHILE left <= right

    mid = (left + right) / 2

    maxRow = 0

    FOR each row i

        IF matrix[i][mid] > matrix[maxRow][mid]
            maxRow = i

    current = matrix[maxRow][mid]

    leftValue = -1
    rightValue = -1

    IF mid > 0
        leftValue = matrix[maxRow][mid - 1]

    IF mid < cols - 1
        rightValue = matrix[maxRow][mid + 1]

    IF current > leftValue AND current > rightValue
        RETURN [maxRow, mid]

    ELSE IF leftValue > current
        right = mid - 1

    ELSE
        left = mid + 1

END WHILE

END
*/
public class FindaPeakElementII{
    public static void main(String[] args) {
        int[][] mat = {
            {10,20,15},
            {21,30,14},
            {7,16,32}
        };

        int row = mat.length;
        int col = mat[0].length;
        int current = 0;

        int left = 0;
        int right = col-1;
        while(left <= right){
            int mid = (left+right)/2;
            int Maxrow = 0;
            for(int i = 0; i<row; i++){
                if(mat[i][mid] > mat[Maxrow][mid]){
                    Maxrow = i;
                }
            }
                current = mat[Maxrow][mid];

                int leftVal = -1;
                int rightVal = -1;

                if(mid > 0){
                    leftVal = mat[Maxrow][mid -1];
                }
                if(mid < col-1){
                    rightVal = mat[Maxrow][mid+1];
                }
                if(current > leftVal && current > rightVal){
                    System.out.println("Peak : " + current);
                    System.out.println("Position : [" + Maxrow + ", " + mid + "]");
                     break;
                }
                else if(leftVal > current){
                   right = mid -1;
                } else {
                    left = mid + 1;
                
            }

        }
    }
}