/*Even odd numbers
//pusedocode
START
    ENTER N VALUE
    COUNT = 0
    FOR I = 1 TO N
    IF(NUM % 2 == 0)
    COUNT ++;
    END IF 
    END LOOP
    OUTPUT COUNT
END

*/
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num value : ");
        int num = sc.nextInt();
        int count = 0;
        for(int i = 1; i<=num; i++){
            if(i % 2 == 0){
                count++;
            }
        }
        System.out.println("Count even days : "+count);
        sc.close();
    }
}