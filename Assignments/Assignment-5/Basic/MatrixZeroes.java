/*https://leetcode.com/problems/set-matrix-zeroes/description/
//pusedocode
START
    INPUT MAT
    INT ROW =  MAT.LENGTH;
    INT COL = MAT[0].LENGTH;
    FOR I = 0 TO ROW
    FOR J = 0 TO COL
    IF(MAT[I][J] == 0)
    ROW[I] = 1;
    COL[J] = 1;
    END IF LOOPS
    BOL ROW1 = NEW INT[ROW]
    BOL COL1 = NEW INT[COL]
    READ COL1 AND ROW 1 
    IF(ROW1[I] || COL1[J])
    MAT[I][J] = 0;
    END IF LOOPS TOO 
    PRINT MAT 
END
 
*/
public class MatrixZeroes {
    public static void main(String[] args) {
        int[][] mat = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        
        int row = mat.length;
        int col = mat[0].length;

        boolean[] row1 = new boolean[row];
        boolean[] col1 = new boolean[col];


        for(int i = 0; i<row; i++){
            for(int j =0; j<col; j++){
                if(mat[i][j] == 0){
                    row1[i] = true;
                    col1[j] = true;
                }
            }
        }
        for(int i = 0; i<row1.length; i++){
            for(int j = 0; j<col1.length; j++){
                if(row1[i] || col1[j]){
                    mat[i][j] = 0;
                } else {
                    
                }
            }
        }
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[i].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}