

/*https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/
//pusedocode
START
    INPUT N
    INPUT SIZE ARRAY N
    FOR I = 0 TO N/2
    SIZE[I] = -(I+1);
    SIZE[N-1-I] = I+1;
    END LOOP
    IF(N % 2 != 0)
    SIZE[N/2] = 0
    END IF
    RETURN TRUE
END
*/
public class UniqueIntegers {
    public static void main(String[] args) {
        
        int[] N ={-2,-1,0,1,2};
        int[] size = new int[N.length];
        for(int i = 0; i<N.length/2; i++){
            size[i] = -(1+i);
            size[N.length-1-i] = i+1;

        }
        if(N.length % 2 != 0){
            size[N.length/2] = 0;
        }
        System.out.println("true");
    }
    
}