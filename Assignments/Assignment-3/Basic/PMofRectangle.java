/*Perimeter of Rectangle

// psuedocode

START 
        ENTER THE VALUES OF BASE AND Breadth
        INPUT B
        INPUT L
        PERAMETER = (2 * (L * B));
        OUTPUT PERAMETER OF RECTANGLE
END


*/
import java.util.Scanner;

public class PMofRectangle {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.print("Enter the values of base and breadth : ");

        int l = In.nextInt();
        int b = In.nextInt();

        int perimeter = (2 * (l*b)); 

        System.out.println("Perimeter of rectangle : " +perimeter);
        

        In.close();
    }

}