/*Total Suface Area Of Cube

// psuedocode

START 
        ENTER THE VALUE OF SIDE
        INPUT S
        
        SURFACE = (6 * (S * S)) ;
        OUTPUT SURFACE OF CUBE
END


*/
import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.print("Enter the value of side : ");

        int side = In.nextInt();
        

        int surface = (6 * (side* side) ); 

        System.out.println("Total Suface Area Of Cube : " +surface);
        

        In.close();
    }

}