
import java.util.*;

/*https://leetcode.com/problems/intersection-of-two-arrays/description/
//pusedocode
START
    INPUT NUM1
    INPUT NUM2
    ARRAYLIST ANS
    FOR I = 0 TO NUM1.LENGTH
    FOR J = 0 TO NUM2.LENGTH // 
    IF(NUM1[I] == NUM2[J] && !ANS.CONTAINS[NUM1[I]])
    ans.add(num1[I])
    END IF LOOPS 
    INPUT RESULT 
    FOR I = 0 TO ANS.SIZE()
    RESULT[I] = ANS.GET[I]
    END LOOP
    PRINT RESULT
END
*/

public class IntersectionofTwoArrays{
    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<num1.length; i++){
            for(int j = 0; j<num2.length; j++){
                if (num1[i] == num2[j] && !ans.contains(num1[i])) {
                    ans.add(num1[i]);
                  }
            }
        }
        int[] result = new int[ans.size()];
        for(int i = 0; i<ans.size(); i++){
            result[i] = ans.get(i);
        }
        System.out.println("IntersectionofTwoArrays : "+  Arrays.toString(result));
    }

}