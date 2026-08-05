/*https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/
//pusedocode
START

INPUT matrix

FOR i = 0 TO number of rows - 1

    min = very large value
    columnIndex = 0


    FOR j = 0 TO number of columns - 1

        IF matrix[i][j] < min

            min = matrix[i][j]

            columnIndex = j

        END IF

    END LOOP


    max = very small value


    FOR k = 0 TO number of rows - 1

        IF matrix[k][columnIndex] > max

            max = matrix[k][columnIndex]

        END IF

    END LOOP


    IF min == max

        ADD min to answer

    END IF


END LOOP


RETURN answer

END
*/
public class LuckyNumber {
    public static void main(String[] args) {
        int[][] nums = {
            {3,7,8},
            {9,11,13},
            {15,16,17}
        };
        int columnIndex = 0;
        
            
        
        for(int i = 0; i<nums.length; i++){
            int min = Integer.MAX_VALUE;
           
            
            for(int j = 0; j<nums[i].length; j++){
                if(nums[i][j] < min){
                    min = nums[i][j];
                    columnIndex = j;
                    
                
            }
        }
        int max = Integer.MIN_VALUE;
        for(int k = 0; k<nums.length; k++){
            
            
                if(nums[k][columnIndex] > max){
                    max = nums[k][columnIndex];
                }
            

        }
        if(min == max){
            System.out.println("Lucky Number : "+min);
            
        }

       }
       
    }
}