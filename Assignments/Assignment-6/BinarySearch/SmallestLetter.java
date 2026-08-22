/*https://leetcode.com/problems/find-smallest-letter-greater-than-target/
//pusedocde
START
    CHAR LETTERS
    CHAR TARGET
    INT LEFT = 0
    INT RIGHT = LETTERS.LENGTH
    WHILE(LEFT <= RIGHT)
    IF(LETTERS[MID] > TARGET)
    RIGHT = MID - 1
    ELSE
    LEFT = MID + 1;
    END IF LOOP
    RETURN LETTERS[LEFT % LETTERS.LENGTH]
END
*/public  class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        int left = 0;
        int right = letters.length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(letters[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(letters[left % letters.length]);

    }
}