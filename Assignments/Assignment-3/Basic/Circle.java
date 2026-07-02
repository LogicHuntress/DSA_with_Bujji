/*Area Of Circle Java Program

// psuedocode
START 
    ENTER THE VALUE OF RADIUS 
    INPUT RADIUS
    // PI VALUE IS = 3.14 PI*R*R

    AREA = (3.14 *(RADIUS*RADIUS))

OUTPUT AREA

END
*/

import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius value : ");

        int radius = sc.nextInt();
        

        double area = (3.14 * (radius * radius)); // pi value is = 3.14

        System.out.println("Area of Circle : " +area);

        sc.close();
    }
}