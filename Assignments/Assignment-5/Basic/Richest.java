

/*https://leetcode.com/problems/richest-customer-wealth/submissions/2075279709/
//pusedocode
START
        INPUT ACOUNTS
        MAX = 0
        FOR I = 0 TO ACOOUNTS.LENGTH
        SUM = 0
        FOR J = 0 TO ACCOUNTS[I] .LENGTH
        SUM+=ACCOUNTS[I][J]
        END LOOP
        END LOOP
        IF(SUM > MAX)
        MAX = SUM
        END IF
        RETURN MAX
END

*/
public class Richest {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,2,3},
            {3,2,9}
        };
       
       int max = 0;
       
       for(int i = 0; i<accounts.length; i++){
        int sum = 0;
        for(int j = 0; j<accounts[i].length; j++){
            sum+= accounts[i][j];
        }
        if(sum>max){
        max = sum;
       }

       }
       
       System.out.println("The Richest one is : "+max);
    }
}