/*Volume Of CYLINDER Java Program

//psuedocode

START 
ENTER THE VALUES OF RADIUS AND HEIGHT

INPUT R
INPUT H

VOLUME = (PI * (R * R) * H);

OUTPUT VOLUME
END

*/
import java.util.Scanner;

public class VmofCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius and height values : ");

        int r = sc.nextInt();
        int h = sc.nextInt();

        double volume = (3.14 * (r * r) * h); // pi = 3.14

        System.out.println("Volume of cylinder : "+volume);
        sc.close();
    }
}