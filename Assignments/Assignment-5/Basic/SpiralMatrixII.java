/*https://leetcode.com/problems/spiral-matrix-ii/description/
//pusedocode
START

Take matrix


count = 1;

int top = 0;
int bottom = matrix.length - 1;
int left = 0;
int right = matrix[0].length - 1;


while(top <= bottom && left <= right) {


    // Top row
    for(int col = left; col <= right; col++) {

        matrix[top][col] into count;
        count++;

    }

    top++;


    // Right column
    for(int row = top; row <= bottom; row++) {

        matrix[row][right] into count;
        count++;

    }

    right--;


    // Bottom row
    if(top <= bottom) {

        for(int col = right; col >= left; col--) {

            matrix[bottom][col] into count;
            count++;

        }

        bottom--;

    }


    // Left column
    if(left <= right) {

        for(int row = bottom; row >= top; row--) {

            matrix[row][left] into count;
            count++;

        }

        left++;

    }

}


RETURN count;

END
*/
public class SpiralMatrixII {
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = new int[n][n];
        int count = 1;

        int top = 0;
        int bottom = matrix.length-1;

        int  left = 0;
        int right = matrix[0].length-1;

        while(top <= bottom && left <= right){
            //top row: left to right
            for(int col = left; col<=right; col++){
                matrix[top][col] = count;
                count++;
            }
            top++;

            //right column : top to bottom
            for(int row = top ; row <= bottom; row++){
                matrix[row][right] = count;
                count++;
            }
            right--;
            if(top <= bottom){
                //bottom row : right to left
                for(int col = right; col>=left; col--){
                    matrix[bottom][col] = count;
                    count++;
                }
                bottom--;

            }
            if(left <= right){
                //left column: bottom to top
                for(int row = bottom; row >= top; row--){
                    matrix[row][left] = count;
                    count++;
                }
                left++;

            }

        }
        for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[i].length; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
    }
}