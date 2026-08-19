/*https://leetcode.com/problems/arranging-coins/description/
//pusedocode
START
    INPUT N
    INPUT ROW = 1
    WHILR( N > = ROW)
    N = N - ROW
    ROW++
    END WHILE
    PRINT ROW-1
END
*/
public class ArrangingCoins {
    public static void main(String[] args) {
        int target = 8;
        int row = 1;

        while(target >= row){
            target = target - row;
            row++;
        }
        System.out.println("no.of rows : "+(row-1));
    }
}