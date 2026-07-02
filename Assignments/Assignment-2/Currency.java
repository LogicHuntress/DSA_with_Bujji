/*Input currency in rupees and output in USD.

//Pusedo code 

START 
INPUT A
USD = 86
RESLUT = A/USD
OUTPUT RESULT
END

*/

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.println("Enter currency value : ");
        int A = In.nextInt();
        
        int USA = 86;

        int result = (A/USA);

        System.out.println("$ : "+result);
    }
}