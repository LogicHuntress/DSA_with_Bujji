/*https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/submissions/2085686951/
//pusedocode
START
        INPUT MAT
        INPUT ANS
        INPUTS N=3,M=2
        INPUT COUNT = 0;
        FOR I = 0 TO MAT.LENGTH
        INPUT ROW = MAT[I][0]
        INPUT COL = MAT[I][1]
        FOR J = 0 TO N
        MAT[ROW][J]++;
        FOR K =  0 TO M
        MAT[I][COL]++;
        END FOR LOOPS
        FOR I = 0 TO N
        FOR J = 0 TO M
        IF(MAT[I][J] % 2 != 0)
        COUNT++
        END IF
        END LOOPS
        PRINT COUNT
END

*/
public class CountOdd {
    public static void main(String[] args) {
        int[][] mat = {
            {0,1},
            {1,1}
        };
       
        int m = 2;
        int n = 3;

        int[][] ans = new int[m][n];
        int count = 0;
        for(int i = 0; i<mat.length; i++){
            int row = mat[i][0];
            int col = mat[i][1];
            for(int j = 0; j<n; j++){
                ans[row][j]++;
            }
            for(int k = 0; k<m; k++){
                ans[k][col]++;
            }

        }
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(ans[i][j] % 2 != 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}