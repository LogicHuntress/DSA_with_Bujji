/*Build Array from Permutation
//pusedocode
START

INPUT ARRAY nums

CREATE NEW ARRAY ans OF SAME SIZE

FOR I = 0 TO nums.length - 1

    ans[I] = nums[ nums[I] ]

END LOOP

PRINT ans

END
*/
import java.util.Scanner;
public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array values : ");

        int[] arr = new int[6];
        int[] ans = new int[6];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<arr.length; i++){
            ans[i] = arr[arr[i]];
            System.out.print(ans[i]+ " ");
            
        }
         
         sc.close();
       
    }
}