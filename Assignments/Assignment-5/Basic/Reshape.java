/*Reshape
//pusedocode
START
        MAT [][]
        INT ROW = 0;
        INT COL = 0;
        INT R = 1;
        INT C = 4;
        INPUT ANS[][]
        IF(MAT.LENGTH *MAT[0].LENGTH != R*C)
        PRINT MAT
        END IF
        FOR I = 0 TO MAT.LENGTH
        FOR J = 0 T0 MAT[I].LENGTH
        ANS[ROW][COL] = MAT[I][J]
        COL++
        IF(COL == C)
        COL = 0;
        ROW++
        END IF
        END FOR LOOP
        END LOOP
        PRINT ANS
END
*/
public class Reshape {
    public static void main(String[] args) {
        int[][] mat = {
            {1,2},
            {3,4}
        };
        int r = 1;
        int c= 4;
        
        if(mat.length * mat[0].length != r * c){
            System.out.print(mat);
        }
        int[][] ans = new int[r][c];
        int col = 0;
        int row = 0;
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[i].length; j++){
                ans[row][col] = mat[i][j];
                col++;
                if(col == c){
                    col = 0;
                    row++;
                }
            }
        }
        for(int i = 0; i < ans.length; i++){
        for(int j = 0; j < ans[i].length; j++){
          System.out.print(ans[i][j] + " ");
             }
                System.out.println();
            }
    }
}