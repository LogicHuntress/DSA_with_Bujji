/*Volume Of Prim Java Program

//psuedocode

START 
ENTER THE VALUES OF BASE AREA AND HEIGHT

INPUT B
INPUT H


VOLUME = ((B*H)/3);

OUTPUT VOLUME
END

*/
import java.util.Scanner;

public class VmofPrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the values of base area and height : ");

        int b = sc.nextInt();
        int h = sc.nextInt();

     

        int volume = ((b * h) / 3);

        System.out.println("Volume of prim : "+volume);
        sc.close();
    }
}