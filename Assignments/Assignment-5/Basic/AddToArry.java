/*AddToArry
//pusedocode
START
INPUT NUMS
NUMBER = 0;
FOR I = 0 TO NUMS
NUMBER = NUMBER * 10 + NUMS[I];
END LOOP
PRINT NUMBER
END
*/
public class AddToArry {
    public static void main(String[] args) {
        int[] nums = {1,2, 0, 0};
        int k = 34;
        int result;
        int number = 0;
        for(int i = 0; i<nums.length; i++){
            number = number * 10 + nums[i];
            
        }
        result = (number+k);
        
        System.out.println(result);
    }
}