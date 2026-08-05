/*https://leetcode.com/problems/spiral-matrix/description/
//pusedocode
START

Take matrix

Create result list

int top = 0;
int bottom = matrix.length - 1;
int left = 0;
int right = matrix[0].length - 1;


while(top <= bottom && left <= right) {


    // Top row
    for(int col = left; col <= right; col++) {

        add matrix[top][col] into result;

    }

    top++;


    // Right column
    for(int row = top; row <= bottom; row++) {

        add matrix[row][right] into result;

    }

    right--;


    // Bottom row
    if(top <= bottom) {

        for(int col = right; col >= left; col--) {

            add matrix[bottom][col] into result;

        }

        bottom--;

    }


    // Left column
    if(left <= right) {

        for(int row = bottom; row >= top; row--) {

            add matrix[row][left] into result;

        }

        left++;

    }

}


RETURN result

END

*/
import java.util.*;

public class SpiralMatrix {
   public static void main(String[] args) {
    int[][] matrix = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
 

        List<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;

        int left = 0;
        int right = matrix[0].length - 1;


        while(top <= bottom && left <= right) {


            // Top row: left to right
            for(int col = left; col <= right; col++) {
                result.add(matrix[top][col]);
            }
            top++;


            // Right column: top to bottom
            for(int row = top; row <= bottom; row++) {
                result.add(matrix[row][right]);
            }
            right--;


            // Bottom row: right to left
            if(top <= bottom) {
                for(int col = right; col >= left; col--) {
                    result.add(matrix[bottom][col]);
                }
                bottom--;
            }


            // Left column: bottom to top
            if(left <= right) {
                for(int row = bottom; row >= top; row--) {
                    result.add(matrix[row][left]);
                }
                left++;
            }

        }

        System.out.println("SpiralMatrix : "+result);
    }
}
        