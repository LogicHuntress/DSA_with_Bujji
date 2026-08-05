/*https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/
//pusedocode
START
        INPUT MAT 
        FOR R = 0 TO 4
        IF(CHECK(MAT,TAGET)) // FUNCTION CALLING
        RETURN TURE
        MAT = ROTATE[MAT] // FUNCTION CALLING
        FALSE


        END LOOP

        FUNCTION INT[][] ROTATE[MAT]
        INT N = MAT.LENGTH
        INT[][] MATRIX = NEW INT[N][N];
        FOR I = 0 TO MAT.LENGTH
        FOR J = 0 TO MAT.LENTH
        MATRIX[J][N-1-I] = MAT[I][J]
        END LOOP 
        END LOOP 
        END FUNCTION 
        FUNCTION 2 BOOLEAN CHECK(INT[] []MAT , INT [][] TARGET) 
        INT N = MAT.LENGTH
        FOR I = 0 TO MAT.LENGTH
        FOR J = 0 TO MAT.LENTH
        IF(MATRIX[I][J] != TARGET[I][J])
        RETURN  FALSE
        END IF
        END LOOP
        END LOOP
        END FUNCTION 
        PRINT TRUE


END


*/
public class Rotation {

    public static void main(String[] args) {

        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int[][] target = {
            {7,4,1},
            {8,5,2},
            {9,6,3}
        };

        boolean result = findRotation(mat, target);

        System.out.println(result);
    }


    static boolean findRotation(int[][] mat, int[][] target) {

        for(int r = 0; r < 4; r++) {

            if(check(mat, target)) {
                return true;
            }

            mat = rotate(mat);
        }

        return false;
    }


    static int[][] rotate(int[][] mat) {

        int n = mat.length;

        int[][] matrix = new int[n][n];

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n; j++) {

                matrix[j][n - 1 - i] = mat[i][j];

            }
        }

        return matrix;
    }


    static boolean check(int[][] mat, int[][] target) {

        int n = mat.length;

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n; j++) {

                if(mat[i][j] != target[i][j]) {
                    return false;
                }

            }
        }

        return true;
    }
}