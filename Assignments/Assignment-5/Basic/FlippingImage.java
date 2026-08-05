/*https://leetcode.com/problems/flipping-an-image/submissions/2085594929/
//pusedocode
START
        INPUT MAT[][]
        FOR I = 0 TO MAT.LENGTH
        INPUT LEFT = 0;
        INPUT RIGHT = MAT[I].LENGTH;
        WHILE(LEFT <= RIGHT)
        INPUT SWAP = MAT[I][LEFT]
        MAT[I][LEFT] = 1-MAT[I][RIGHT]
        MAT[I][RIGHT] = 1- TEMP
        END WHILE
        END FOR
        PRINT MAT
END

*/
public class FlippingImage {
    public static void main(String[] args) {
        int[][] mat = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };
        for(int i = 0; i<mat.length; i++){
            int left = 0;
            int right = mat[i].length-1;
            while(left <= right){
                int temp = mat[i][left];
                mat[i][left] = 1-mat[i][right];
                mat[i][right] = 1-temp;
                left++;
                right--;
            }
        }
        System.out.println("Fliiped Image : ");
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[i].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}