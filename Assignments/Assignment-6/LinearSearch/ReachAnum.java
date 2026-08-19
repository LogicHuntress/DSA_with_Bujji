/*https://leetcode.com/problems/reach-a-number/submissions/2111609715/
//pusedocode
START
        INPUT TARGET  = 3;
        INPUT MOVES = 0;
        INPUT SUM = 0;
        INPUT DIV = 0;
        IF(TARGET == 0)
        PRINT 0;
        END IF 
        TARGET = MATH.ABs(TARGET)
        WHILE(SUM < TARGET)
        MOVES++;
        SUM = SUM +MOVES;
        DIV = SUM - TARGET
        END WHILR
        WHILE(DIV % 2 != 0)
        MOVES++;
        SUM += MOVES
        DIV = SUM - TARGET;
        END LOOP
        PRINT MOVES 
END
*/
public class ReachAnum {
    public static void main(String[] args) {
       
        int target = 3;
        int moves = 0;
        int sum = 0;
        int div = 0;
        if(target == 0){
            System.out.println(0);
            return;
        }
        target = Math.abs(target);
        while(sum < target){
            moves++;
            sum += moves;
            div = sum - target;

        }
        while(div % 2 != 0){
            moves++;
            sum += moves;
            div = sum - target;

        }
        System.out.println("No.of moves are : "+moves);
    }
}