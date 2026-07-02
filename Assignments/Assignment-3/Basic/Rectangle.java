/*Area Of Rectangle Program

//Puesdocode

START
    ENTER VALUES OF B AND L
    INPUT1
    INPUT1

    AREA = (L*B)
    OUTPUT AREA

END


*/
import java.util.Scanner;
public  class Rectangle {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.print("Enter the L and B values : ");
        int L = In.nextInt();
        int B = In.nextInt();

        int Area = (L*B);

        System.out.println("Area of rectangle = " +Area);

        In.close();
    }
}


