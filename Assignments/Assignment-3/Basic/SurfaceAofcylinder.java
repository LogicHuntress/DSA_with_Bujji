/*Curved Surface Area Of Cylinder

//psuedocode

START 
ENTER THE VALUES OF RADIUS AND HEIGHT

INPUT R
INPUT H

Surface = (2 *(PI * (R  * H));

OUTPUT Surface
END

*/
import java.util.Scanner;

public class SurfaceAofcylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius and height values : ");

        int r = sc.nextInt();
        int h = sc.nextInt();

        double surface = (2 *(3.14 * (r * h))); // pi = 3.14

        System.out.println("Volume of cylinder : "+surface);
        sc.close();
    }
}