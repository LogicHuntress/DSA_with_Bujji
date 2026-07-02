/*Take name as input and print a greeting message for that particular name.

//  Psuedocode

START 
ENTER NAME
INPUT NAME
IF( NAME.EQUALS("BEULA") )
OUTPUT "CONGRATULATIONS"
ELSE
OUTPUT "SORRY YOUR REJECTED"
END IF
END


*/
import  java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.print("Enter name: ");
        String name = input.nextLine();

        if(name.equals("Beula") ){
            System.out.println("congratulations Beula");
        } else {
            System.out.println("Sorry...!, Your are not");
        }
        input.close();
    }

}