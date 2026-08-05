/*https://leetcode.com/problems/transpose-matrix/description/
//pusedocode
START
        INPUT MAT
        INPUT ANS = [MAT.LENGTH][MAT.LENGTH]
        FOR I = 0 TO MAT.LENGTH
        FOR I = 0 TO MAT.LENGTH
        ANS[J][I] = MAT[I][J]
        END LOOP
        END LOOP

        FOR I = 0 TO ANS.LENGTH
        FOR I = 0 TO ANS[I].LENGTH
        PRINT ANS[J][I]
        END LOOP
        END LOOP

END

*/public class Transpose {
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int n = mat.length;
        int[][] ans = new int[n][n];

        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat.length; j++){
                ans[j][i] = mat[i][j];
            }
        }
        for(int i = 0; i<ans.length; i++){
            for(int j = 0; j<ans[i].length; j++){
                System.out.print(ans[j][i]+" ");
                
            }
            System.out.println();
        }
        
        
    }
}