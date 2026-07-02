/*Area Of Rhombus Java Program

// psuedocode
START 
    ENTER THE VALUE OF diagonal1 and diagonal2
    // It's depends on the output type taking int values get value int type or else double float
    INPUT diagonal1
    INPUT diagonal2

    Area = (diagonal1*diagonal2)/2


OUTPUT AREA

END
*/

import java.util.Scanner;
public class Rhombus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the values of diagonal1 and diagonal2 : ");

        double diagonal1 = sc.nextDouble();
        double diagonal2 = sc.nextDouble();
        

        double area = ((diagonal1 * diagonal2)/2); // pi value is = 3.14

        System.out.println("Area of Rhombus : " +area);

        sc.close();
    }
}