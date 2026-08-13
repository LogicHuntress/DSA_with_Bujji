/*https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/submissions/2105634200/
//pusedocode
START
    INPUT MAT
    INPUT COUNT = 0
    FOR I = 0 TO MAT.LENGTH
    FOR J = 0 TO MAT[I].LENGTH
    IF(MAT[I][J] < 0)
    COUNT++
    END IF LOOPS
    PRINT COUNT
END

*/
public class FindNegativenums {
    public static void main(String[] args) {
        int[][] Mat = {
            {4,3,2,-1},
            {3,2,1,-1},
            {1,1,-1,-2},
            {-1,-1,-2,-3}
        };
        int count = 0;
        for(int i = 0; i<Mat.length; i++){
            for(int j = 0; j<Mat[i].length; j++){
                if(Mat[i][j]<0){
                    count++;
                }
            }
        }
        System.out.println("Negative numbers are is : "+count);
    }
}