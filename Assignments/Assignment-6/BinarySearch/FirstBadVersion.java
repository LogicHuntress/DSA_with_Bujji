/*https://leetcode.com/problems/first-bad-version/description/
//pusedocode
START

READ n

left = 1
right = n

WHILE left <= right

    mid = left + (right - left) / 2

    IF isBadVersion(mid) == true
        right = mid - 1

    ELSE
        left = mid + 1

RETURN left

END
*/
public class FirstBadVersion {

    static int firstBad = 4;

    static boolean isBadVersion(int n) {
            return n >= firstBad;
    }

    public static void main(String[] args) {
        int n = 5;
        int left = 1; 
        int right = n;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(isBadVersion(mid)){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        System.out.println("First bad version : " + left);
    }
}
