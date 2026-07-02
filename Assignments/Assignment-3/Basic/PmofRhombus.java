/*Perimeter of RHOMBUS

// psuedocode

START 
        ENTER THE VALUE OF SIDE
        INPUT S
        
        PERAMETER = 4 * S;
        OUTPUT PERAMETER OF RHOMBUS
END


*/
import java.util.Scanner;

public class PmofRhombus {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.print("Enter the value of side : ");

        int side = In.nextInt();
        

        int perimeter = (4 * side); 

        System.out.println("Perimeter of Rhombus : " +perimeter);
        

        In.close();
    }

}