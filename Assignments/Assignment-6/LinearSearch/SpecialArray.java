/*https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/
//pusedocode
START
    INPUT ARR
    FOR X = 0 TO <=ARR.LENGTH
    INT COUNT = 0
    FOR I = 0 TO ARR.LENGTH
    IF(ARR[I] >= X)
    COUNT++
    END IF
    END LOOP
    IF(COUNT == X)
    PRINT X
    END IF  LOOP
    PRINT
    -1
END

*/
public class SpecialArray {
    public static void main(String[] args) {
        int[] arr = {3,5};
        for(int x = 0; x<=arr.length; x++){
            int count = 0;
            for(int i = 0; i<arr.length; i++){
                if(arr[i]>=x){
                    count++;
                }
            }
            if(count == x){
                System.out.println(x);
            }

        }
        System.out.println();
    }
}