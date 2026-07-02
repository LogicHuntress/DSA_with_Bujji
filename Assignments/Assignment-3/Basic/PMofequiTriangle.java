/*Perimeter of Equilateral Triangle

// psuedocode

START 
        ENTER THE VALUE OF SIDE
        INPUT S
        
        PERAMETER = 3 * S;
        OUTPUT PERAMETER OF Equilateral Triangle
END


*/
import java.util.Scanner;

public class PMofequiTriangle {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.print("Enter the value of side : ");

        int side = In.nextInt();
        

        int perimeter = (3 * side); 

        System.out.println("Perimeter of Equilateral Triangle : " +perimeter);
        

        In.close();
    }

}