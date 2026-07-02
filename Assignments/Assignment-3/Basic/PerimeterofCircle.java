/*Perimeter of Circle

// psuedocode

START 
        ENTER THE RADIUS VALUE 
        INPUT Radius
        PERIMETER = 2 * PI * Radius
        OUTPUT PERAMETER OF CIRCLE
END


*/
import java.util.Scanner;

public class PerimeterofCircle {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.print("Enter the radius value : ");

        int radius = In.nextInt();

        double perimeter = (2 * 3.14 * radius); // pi = 3.14

        System.out.println("Perimeter of Circle : " +perimeter);
        

        In.close();
    }

}