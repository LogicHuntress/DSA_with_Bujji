/*Area Of Isosceles Java Program

// psuedocode
START 
    ENTER THE VALUE OF Base and Height
    // It's depends on the output type taking int values get value int type or else double float
    INPUT base 
    INPUT Height

    Area = (bse*height)/2


OUTPUT AREA

END
*/

import java.util.Scanner;
public class Isosceles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the values of base and height : ");

        double base = sc.nextDouble();
        double height = sc.nextDouble();
        

        double area = ((base * height)/2); // pi value is = 3.14

        System.out.println("Area of Isosceles : " +area);

        sc.close();
    }
}