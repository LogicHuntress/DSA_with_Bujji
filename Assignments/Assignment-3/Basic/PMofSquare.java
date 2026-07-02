/*Perimeter of SQUARE

// psuedocode

START 
        ENTER THE VALUE OF SIDE
        INPUT S
        
        PERAMETER = 4 * S;
        OUTPUT PERAMETER OF SQUARE
END


*/
import java.util.Scanner;

public class PMofSquare {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.print("Enter the value of side : ");

        int side = In.nextInt();
        

        int perimeter = (4 * side); // pi = 3.14

        System.out.println("Perimeter of Square : " +perimeter);
        

        In.close();
    }

}