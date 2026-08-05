/*https://leetcode.com/problems/toeplitz-matrix/description/
//pusedocode
START
    INPUT MAT
    
    FOR I = 1 TO MAT.LENGTH
    FOR J = 1 TO MAT[I].LENGTH
    if(MAT[I][J] != MAT[I-1][J-1])
    print flase
    else true
    
    END LOOP
    END LOOP
    
END

*/
public class Toeplitz{
    public static void main(String[] args) {
        int[][] Mat = {
            {1,2,3,4},
            {5,1,2,3},
            {9,5,1,2}
        };
        
        for(int i = 1; i<Mat.length; i++){
            for(int j = 1; j<Mat[i].length; j++){
                if(Mat[i][j] != Mat[i-1][j-1]){
                    System.out.println("false");
                }else{
                    System.out.println("true");
                }
                

            
            }
        }
        System.out.println();

        
        
    }
}