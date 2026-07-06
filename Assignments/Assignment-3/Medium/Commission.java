/*Calculate Commission Percentage
//pusedocode
START
    ENTER THE PRICE AND COMMISSION VALUES;
    INPUT PRICE
    INPUT COMMISSION
    COMMISSION AMOUNT = (COMMISSION AMOUNT * PRICE)/100
    OUTPUT COMMISSION AMOUNT
END

*/import java.util.Scanner;
public class Commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price and commission values : ");
        int price = sc.nextInt();
        int commission = sc.nextInt();
        int CommissionaAmount = ((commission * price)/100);
        System.out.println("Commission Percentage : "+CommissionaAmount);
        sc.close();

    }
}