/*Write a program to print the circumference and area of a circle of radius 
entered by user by defining your own method.
//pusedocode
START
        ENTER THE RADIUS VALUE
        INPUT R
        CIRCLE(R)
        FUNCTION CIRCLE(DOUBLE R)
        DOUBLE CIRCUMFERENCE = 2 * 3.14*R;
        DOUBLE AREA = 3.14 * R * R
        PRINT CIRCUMFERENCE
        PRINT AREA
        END FUNCTION
END 

*/
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius value : ");
        int r = sc.nextInt();
        Circle(r);
        sc.close();
    }
    static void Circle(double r) {
        double circumference = (2 * Math.PI * r);
        double Area = (Math.PI * r * r);

        System.out.println("The Circumference is : "+circumference);
        System.out.println("The area of circle is : "+Area);
        
    }
}