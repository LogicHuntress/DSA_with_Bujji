/*https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
//pusedocode;
START
    INPUT NUM1
    BOOLEAN ANS = FALSE
    FOR I = 0 TO NUM1.LENGTH
    FOR J = 0 TO NUM1.LENGTH 
    IF(I!=J && NUM1[I] == 2 * NUM1[J])
    PRINT TRUE
    ELSE
    FALSE
    END IF LOOPS
    
    
END
*/
public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        int[] Mat = {10,2,5,3};
        boolean ans = false;
        for(int i = 0; i<Mat.length; i++){
            for(int j = 0; j<Mat.length; j++){
                if(i!=j && Mat[i] == 2 *Mat[j]){
                    ans = true;
            
                }
            }
        }
        System.out.println(ans);
    }
}