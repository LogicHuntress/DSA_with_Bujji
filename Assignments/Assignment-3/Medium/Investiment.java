/*Calculate Investiment
//pusedocode
START
        ENTER THE PRICE RATE AND YEAR VALUES
        INPUT1 PRICE
        INPUT2 RATE
        INPUT3 YEAR
        FOR I = 1 TO YEAR
        DISCOUNT = RATE * PRICE /100
        VALUE = PRICE + DISCOUNT 
        PRICE = VALUE
        
        END LOOP 
        OUTPUT 
END 
*/
import java.util.Scanner;

public class Investiment {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.print("Enter the price rate and year values : ");

        int price = In.nextInt();
        int rate = In.nextInt();
        int year = In.nextInt();

        int discount;
        int Value ;

        for(int i = 1; i<=year; i++){
             discount = ((price * rate)/100);
             Value = (price + discount);
             price = Value;
             
        }
        System.out.println("Investiment : " +price);
        In.close();



    }
}