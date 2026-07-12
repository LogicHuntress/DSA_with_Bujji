/*Write a program to print the factorial of a number by defining a method named 'Factorial'. 
Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.
//pusedocode
START
        ENTER THE NUM
        INPUT NUM
        CALL FACT(NUM)


        FUNCTION FACT (INT NUM)
        FACT = 1
        FOR I = 1 TO NUM 
        FACT *= I

        END LOOP
        OUTPUT PRINT FACT
        END FUNCTION
END
*/import java.util.Scanner;
public  class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num value : ");
        int num = sc.nextInt();
        fact(num);

        sc.close();
    }
    static void fact(int num) {
        int fact = 1;
        for(int i = 1; i<= num; i++){
            fact *= i;
        }
        System.out.println("factorial of num : "+fact);
        
    }
}