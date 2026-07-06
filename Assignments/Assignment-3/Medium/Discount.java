/*Calculate Discount Of Product
 //pusedocode
 START
        ENTER THE PRICE AND DISCOUNT 
        INPUT P
        INPUT D
        DISCOUNTAMOUNT = (D * P)/100
        FINAL AMOUNT = P - DISCOUNTAMOUNT
        OUTPUT FINAL AMOUNT 
END
*/
import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price and Discount values : ");
        
        int price = sc.nextInt();
        int discount = sc.nextInt();

        int discountAmount = (discount * price)/100;
        int finalPrice = price - discountAmount;

        System.out.println("Discount Of Product is : "+finalPrice);
        sc.close();

    }
}