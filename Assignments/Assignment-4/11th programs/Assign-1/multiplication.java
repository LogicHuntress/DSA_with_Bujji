/*Take a number as input and print the multiplication table for it.
//pusedocde
START
        ENTER THE NUMBER
        INPUT NUM
        CALL MUL(NUM)
        FUNCTION MUL(INT NUM)
        FOR I = 1 TO 10
        RESULT = NUM * I;
        PRINT (RESULT)
        END FOR
        END FUNCTION
END
*/
import java.util.Scanner;
public  class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        mul(num);

        sc.close();
    }
    static void mul(int num) {

        for(int i = 1; i<=10; i++){
            int result = num * i;
            System.out.println(" "+num+ " X " +i+ " = " +result);
        }
        
        
    }
}