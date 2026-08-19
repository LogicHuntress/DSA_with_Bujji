/*https://leetcode.com/problems/guess-number-higher-or-lower/
//pusedocode
START

function guess 
input p = 6
if(num ==pick)
return 0;
else if(num > pick)
return -1;
else 
return 1;
end function 
INPUT N 
LEFT = 1
RIGHT = N

WHILE(LEFT <= RIGHT)
MID =  LEFT+(RIGHT - LEFT)/2
INT RESULT = GUESS(MID) // calling function name 

IF(RESULT == 0;)
RETURN MID;
END IF 
IF(RESULT == -1)
RIGHT = MID -1;
ELSE 
LEFT = MID +1;
END 
RETURN -1;

*/
public class GuessNumber {
    static int pick = 6;

    static int guess(int num) {
        if (num == pick) {
            return 0;
        } else if (num > pick) {
            return -1;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

        int n = 10;

        int left = 1;
        int right = n;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int result = guess(mid);

            if(result == 0) {
                System.out.println("Secret number : " + mid);
                break;
            } else if (result == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
    }
}