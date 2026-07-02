/*Volume Of Sphere Java Program

//psuedocode

START 
ENTER THE VALUE OF RADIUS

INPUT R


VOLUME = ((4.0/3)*PI * (R * R * R));

OUTPUT VOLUME
END

*/
import java.util.Scanner;

public class VmofSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius  value : ");

        int r = sc.nextInt();
     

        double volume = ((4.0/3)*(3.14) * (r * r * r)); // pi = 3.14

        System.out.println("Volume of sphere : "+volume);
        sc.close();
    }
}