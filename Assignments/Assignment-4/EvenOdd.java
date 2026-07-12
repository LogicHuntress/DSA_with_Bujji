/*Define a program to find out whether a given number is even or odd.
//psuedocode
START
ENTER THE NUMBER
CALL FUNCTION ();
FUNCTION EvenOdd()
if(num % 2 == 0)
print even 
else print odd
end if 
end function
end 
*/
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        EvenOdd(num);

        sc.close();


    }
    
    static void EvenOdd(int num){
        if(num % 2 == 0){
            System.out.println("Even number");
        } else {
            System.out.println("Odd number ");
        }
    }


}