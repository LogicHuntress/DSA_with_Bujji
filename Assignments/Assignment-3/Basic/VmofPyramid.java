/*Volume Of Pyramid Java Program

//psuedocode

START 
ENTER THE VALUES OF BASE AREA AND HEIGHT

INPUT B
INPUT H


VOLUME = (B*H);

OUTPUT VOLUME
END

*/
import java.util.Scanner;

public class VmofPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the values of base area and height : ");

        int b = sc.nextInt();
        int h = sc.nextInt();

     

        int volume = (b * h) ;

        System.out.println("Volume of pyramid : "+volume);
        sc.close();
    }
}