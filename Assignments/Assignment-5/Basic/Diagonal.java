/*https://leetcode.com/problems/matrix-diagonal-sum/description/
//pusedocode
START
    INPUT MAT
    INT SUM = 0
    FOR I = 0 TO MAT.LENGTH
    SUM=SUM+MAT[I][I]
    SUM+=MAT[I][MAT.LENGTH-1-I]
    IF(MAT.LENGTH % 2 !=0)
    SUM- = mat[MAT.LENTH/2][MAT.LENTH/2]
    END IF
    END LOOP
    PRINT SUM
END

*/
public class Diagonal {
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int sum = 0;
        for(int  i = 0; i<mat.length; i++){
            sum +=mat[i][i];
            sum+=mat[i][mat.length-1-i];
            
        }
        if(mat.length % 2 != 0){
                sum-=mat[mat.length / 2][mat.length / 2];
            }
        System.out.println("The diagonal sum is : "+sum);
    }
}