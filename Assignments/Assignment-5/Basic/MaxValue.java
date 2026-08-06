/*https://leetcode.com/problems/max-value-of-equation/description/
//pusedocode
START

INPUT points[][]
INPUT k

int ans = Integer.MIN_VALUE

CREATE Deque<int[]> deque


FOR i = 0 TO points.length-1

    int x = points[i][0]
    int y = points[i][1]


    WHILE deque is not empty 
          AND x - deque.peekFirst()[0] > k

        deque.removeFirst()


    IF deque is not empty

        int previous = deque.peekFirst()[1]

        int current = y + x

        ans = Math.max(ans, previous + current)



    int value = y - x


    WHILE deque is not empty 
          AND deque.peekLast()[1] <= value

        deque.removeLast()



    deque.addLast(new int[]{x, value})


PRINT ans

END
*/
import java.util.*;

public class MaxValue {

    public static void main(String[] args) {

        int[][] points = {
            {1, 3},
            {2, 0},
            {5, 10},
            {6, -10}
        };

        int k = 3;

        int ans = Integer.MIN_VALUE;

        // stores {x, y-x}
        Deque<int[]> deque = new ArrayDeque<>();


        for (int i = 0; i < points.length; i++) {

            int x = points[i][0];
            int y = points[i][1];


            // remove points outside k distance
            while (!deque.isEmpty() && x - deque.peekFirst()[0] > k) {
                deque.removeFirst();
            }


            // calculate answer using best previous point
            if (!deque.isEmpty()) {

                int bestPrevious = deque.peekFirst()[1];

                int currentValue = y + x;

                ans = Math.max(ans, bestPrevious + currentValue);
            }


            // value to store = y - x
            int value = y - x;


            // remove smaller values from back
            while (!deque.isEmpty() 
                    && deque.peekLast()[1] <= value) {

                deque.removeLast();
            }


            // add current point
            deque.addLast(new int[]{x, value});
        }


        System.out.println(ans);
    }
}