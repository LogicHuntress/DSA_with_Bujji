/*Write a program that will ask the user to enter his/her marks (out of 100). 
Define a method that will display grades according to the marks entered as below:
//pusedocode
START
ENTER THE MARKS
INPUT NUM

        FUNCTION MARKS (INT NUM)
        IF(NUM >=91 && NUM <=100)
        PRINT AA
        ELSE (NUM >=81 && NUM <= 90)
        PRINT AB
        ELSE (NUM >=71 && NUM <= 80)
        PRINT BB
        ELSE (NUM >=61 && NUM <= 70)
        PRINT BC
        ELSE (NUM >=51 && NUM <= 60)
        PRINT CD
        ELSE (NUM >=41 && NUM <= 50)
        PRINT DD
        ELSE IF (NUM <=40)
        PRINT FAIL
        END IF 
        END FUNCTION 
END
*/
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int num = sc.nextInt();
        marks(num);
        sc.close();
    }
    static void marks(int num) {
        if(num >=91 && num <= 100){
            System.out.println("AA");
        }else if (num >= 81 && num <= 90){
            System.out.println("AB");
        }else if (num >= 71 && num <= 80){
            System.out.println("BB");
        }else if (num >= 61 && num <= 70){
            System.out.println("BC");
        }else if (num >= 51 && num <= 60){
            System.out.println("CD");
        }else if (num >= 41 && num <= 50){
            System.out.println("DD");
        }else if(num <= 40){
            System.out.println("Fail");
        }
        
    }
}