/*https://leetcode.com/problems/4sum/
//pusedocde
START

Take an empty answer list

Sort the array

Read first element using i

Read second element using j

Take left = j + 1

Take right = last index

WHILE left < right

    Add nums[i] + nums[j] + nums[left] + nums[right]

    IF sum == target
        Add these 4 values to answer
        left++
        right--

    ELSE IF sum < target
        left++

    ELSE
        right--

RETURN answer

END
*/
import java.util.*;

public class FourSum {
    public static void main(String[] args) {

        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {

            for (int j = i + 1; j < nums.length - 2; j++) {

                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {

                    long sum = (long) nums[i]
                            + nums[j]
                            + nums[left]
                            + nums[right];

                    if (sum == target) {

                        ans.add(Arrays.asList(
                                nums[i],
                                nums[j],
                                nums[left],
                                nums[right]
                        ));

                        left++;
                        right--;

                    } else if (sum < target) {

                        left++;

                    } else {

                        right--;
                    }
                }
            }
        }

        System.out.println("Four Sum : " + ans);
    }
}