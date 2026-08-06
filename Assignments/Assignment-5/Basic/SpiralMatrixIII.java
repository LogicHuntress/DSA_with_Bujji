/*https://leetcode.com/problems/spiral-matrix-iii/
//pusedocode
START
INPUT ARRAY
INT ROWS = 5
INT COLS = 6
INT RS = 1
INT CS = 4
INTPUT ARRAY ANS = [ROW * COLS][2]
INT INDEX = 0;
INT ROW = RS
INT COL = CS
INT STEP = 1
ANS[INDEX[0]] = ROW
ANS[INDEX[1]] = COL
INDEX++;
WHILE(INDEX < ROWS * COLS)
FOR (ROW >= 0 && ROW < ROWS && COL >= 0 && COL < COLS)
ANS[INDEX[0]] = ROW
ANS[INDEX[1]] = COL
INDEX++;
END WHILE FOR
STEP++
FOR I = 0 TO STEP
ROW ++
IF(row >= 0 && row < rows && col >= 0 && col < cols)
ANS[INDEX[0]] = ROW
ANS[INDEX[1]] = COL
INDEX++;
END IF LOOP
STEP++

FOR I = 0 TO STEP
COL--
if (row >= 0 && row < rows && col >= 0 && col < cols)
ANS[INDEX[0]] = ROW
ANS[INDEX[1]] = COL
INDEX++;
END IF LOOP


FOR I = 0 TO STEP 
ROW--
if (row >= 0 && row < rows && col >= 0 && col < cols)
ANS[INDEX[0]] = ROW
ANS[INDEX[1]] = COL
INDEX++;
END IF LOOP
STEP++
END  LOOP
FOR I = 0 TO ANS.LENGTH
RETURN ANS
END

*/
import java.util.*;

public class SpiralMatrixIII {
    public static void main(String[] args) {

        int rows = 5;
        int cols = 6;

        int rStart = 1;
        int cStart = 4;

        int[][] ans = new int[rows * cols][2];

        int index = 0;

        int row = rStart;
        int col = cStart;

        int step = 1;

        // Store starting position
        ans[index][0] = row;
        ans[index][1] = col;
        index++;

        while (index < rows * cols) {

            // Move Right
            for (int i = 0; i < step; i++) {
                col++;

                if (row >= 0 && row < rows && col >= 0 && col < cols) {
                    ans[index][0] = row;
                    ans[index][1] = col;
                    index++;
                }
            }


            // Move Down
            for (int i = 0; i < step; i++) {
                row++;

                if (row >= 0 && row < rows && col >= 0 && col < cols) {
                    ans[index][0] = row;
                    ans[index][1] = col;
                    index++;
                }
            }

            step++;


            // Move Left
            for (int i = 0; i < step; i++) {
                col--;

                if (row >= 0 && row < rows && col >= 0 && col < cols) {
                    ans[index][0] = row;
                    ans[index][1] = col;
                    index++;
                }
            }


            // Move Up
            for (int i = 0; i < step; i++) {
                row--;

                if (row >= 0 && row < rows && col >= 0 && col < cols) {
                    ans[index][0] = row;
                    ans[index][1] = col;
                    index++;
                }
            }

            step++;
        }


        // Print answer
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
}