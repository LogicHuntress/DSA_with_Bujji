/*https://leetcode.com/problems/sqrtx/
//pusedocode
START

READ x

IF x < 2
    RETURN x

left = 1
right = x
answer = 0

WHILE left <= right

    mid = left + (right - left) / 2

    IF mid * mid == x
        RETURN mid

    ELSE IF mid * mid < x
        answer = mid
        left = mid + 1

    ELSE
        right = mid - 1

RETURN answer

END
*/ public class Sqrt {
    public static void main(String[] args) {
        int x = 4;
        if(x < 2){
            System.out.println(x);
            return;
        }

        int left = 1; 
        int right = x;
        int ans = 0;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(mid * mid == x){
                System.out.println(mid);
                return;
            } else if(mid * mid < x){
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(ans);
    }
}