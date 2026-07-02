/*Area Of Equilateral Triangle Java Program

// psuedocode
START 
    ENTER THE VALUE OF side
    // It's depends on the output type taking int values get value int type or else double float
    INPUT side

    Area = (Math.sqrt(3/4)*side*side)


OUTPUT AREA

END
*/

import java.util.Scanner;
public class EquilateralTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of Side : ");

        int side = sc.nextInt();
        
        

        double area = (Math.sqrt(3) / 4) * side * side;

        System.out.println("Area of Equilateral Triangle : " +area);

        sc.close();
    }
}