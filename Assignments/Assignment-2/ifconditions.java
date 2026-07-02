/*Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
// pusedocode

START

INPUT NUM1

INPUT NUM2

INPUT OPERATOR

IF(OP == '+')
    OUTPUT NUM1 + NUM2

ELSE IF(OP == '-')
    OUTPUT NUM1 - NUM2

ELSE IF(OP == '*')
    OUTPUT NUM1 * NUM2

ELSE IF(OP == '/')
    OUTPUT NUM1 / NUM2

ELSE
    OUTPUT "Invalid Operator"

END

*/

import java.util.Scanner;

public class ifconditions {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the operator : ");

        char op = Input.next().charAt(0);

        System.out.print("Enter the numbers : ");
        int num1 = Input.nextInt();
        int num2 = Input.nextInt();

        int ans = 0;

        if(op == '+'){
            ans = num1 + num2;
            System.out.print(ans);

        } else if(op == '-'){
            ans = num1 - num2;
            System.out.print(ans);

        } else if(op == '*'){
            ans = num1 * num2;
            System.out.print(ans);

        } else if(op == '/'){
            ans = num1 / num2;
            System.out.print(ans);

        }else {
            System.err.println("Inavalid");
        }
        Input.close();

    }
}