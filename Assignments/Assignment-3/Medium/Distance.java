/* Calculate Distance Between Two Points
 //pusedocode
 START
        ENTER 4 INPUT VALUES
        INPUT X1,X2,Y1,Y2
        DX = X2-X1
        DY = Y2-Y1
        SQ1 = MATH.POW(DX ,2)
        SQ2 = MATH.POW(DY ,2)
        ADD = SQ1 + SQ2
        DISTANCE = MATH.SQRT(ADD)
        OUTPUT DISTANCE
 END
*/
import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.print("Enter 4 input values : ");
            int x1 = In.nextInt();
            int x2 = In.nextInt();
            int y1 = In.nextInt();
            int y2 = In.nextInt();

        int dx = (x2-x1);
        int dy = (y2-y1);

        double sq1 = Math.pow(dx,2);
        double sq2 = Math.pow(dy,2);

        double add = (sq1 + sq2);

        double Distance = Math.sqrt(add);
        System.out.println("Distance Between Two Points : " +Distance);
        In.close();
    }
}
