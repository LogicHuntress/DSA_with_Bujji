/*https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

//pusedocode
START

INPUT candies
INPUT extraCandies

FIND maximum candies

CREATE answer array/list

FOR every child

    IF candies[i] + extraCandies >= maximum

        answer = true

    ELSE

        answer = false

END LOOP

RETURN answer

END
*/
public class Candies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies  = 3;
        int Max = 5;
        boolean[] ans = new boolean[candies.length];
        for(int i = 0; i<candies.length; i++){
            if(candies[i] + extraCandies >= Max){
                ans[i] = true;
            }else{
                ans[i] = false;
            }
        }
        for(int i = 0; i<ans.length; i++){
             System.out.print(ans[i]+ " ");
        }
       
    }
}