/*
//pusedocode
START

INPUT nums

COUNT = 0

FOR every number in nums

    IF evenDigits(number)

        COUNT++

END LOOP

RETURN COUNT

------------------------

FUNCTION evenDigits(number)

    DIGITS = 0

    WHILE number > 0

        DIGITS++

        number = number / 10

    END LOOP

    IF DIGITS % 2 == 0

        RETURN TRUE

    ELSE

        RETURN FALSE

END FUNCTION
*/public class EvenDigits {
    public static void main(String[] args) {

        int[] nums = {555, 901, 482, 1771};
        int count = 0;

        for(int i = 0; i < nums.length; i++) {

            if(evenDigits(nums[i])) {
                count++;
            }
        }

        System.out.println("Count of even digit numbers: " + count);
    }

    static boolean evenDigits(int number) {

        int digits = 0;

        while(number > 0) {
            digits++;
            number /= 10;
        }

        return digits % 2 == 0;
    }
}