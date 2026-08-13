import java.util.*;
/*https://leetcode.com/problems/intersection-of-two-arrays-ii/description/

//pusedocode
START
    INPUT NUM1
    INPUT NUM2
    ARRAYLIST ANS
    boolean USED = num2.length
    FOR I = 0 TO NUM1.LENGTH
    FOR J = 0 TO NUM2.LENGTH // 
    IF(NUM1[I] == NUM2[J] !USED[J])
    ans.add(num1[I])
    USED[J] = TRUE;
    BREAK;
    END IF LOOPS 
    INPUT RESULT 
    FOR I = 0 TO ANS.SIZE()
    RESULT[I] = ANS.GET[I]
    END LOOP
    PRINT RESULT
END
*/

public class IntersectionofTwoArraysII{
    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] used = new boolean[num2.length];
        for(int i = 0; i<num1.length; i++){
            for(int j = 0; j<num2.length; j++){
                if (num1[i] == num2[j] && !used[j]) {
                    ans.add(num1[i]);
                    used[j] = true;
                    break;

                  }
            }
        }
        int[] result = new int[ans.size()];
        for(int i = 0; i<ans.size(); i++){
            result[i] = ans.get(i);
        }
        System.out.println("IntersectionofTwoArraysII : "+  Arrays.toString(result));
    }

}