/*PERIMETER OF PARALLELOGRAM

// psuedocode
START 
    ENTER THE VALUE OF Base and Height
    // It's depends on the output type taking int values get value int type or else double float
    INPUT base 
    INPUT Height

    PERIMETER =  2 *(bse+height)


OUTPUT PERIMETER

END
*/

import java.util.Scanner;
public class pmofparallelogram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the values of base and height : ");

        int base = sc.nextInt();
        int height = sc.nextInt();
        

        int perimeter = (2 * (base + height)); 

        System.out.println("Perimeter of Parallelogram : " +perimeter);

        sc.close();
    }
}