/*https://leetcode.com/problems/maximum-population-year/description/
//pusedocode
START

INPUT logs

maxPeople = 0

answerYear = 0


FOR year = 1950 TO 2050

    count = 0


    FOR each person in logs

        birthYear = person[0]

        deathYear = person[1]


        IF birthYear <= year AND year < deathYear

            count++

        END IF


    END LOOP


    IF count > maxPeople

        maxPeople = count

        answerYear = year

    END IF


END LOOP


RETURN answerYear

END
*/
public class Population {
    public static void main(String[] args){
        int[][] log = {
            {1993,1999},
            {2000, 2010}
        };
        int MaxPeople = 0;
        int answerYear = 0;
        int birthYear = 0;
        int deathYear = 0; 
       
        
        for(int i = 1950; i<2050; i++){
            int count = 0;
            for(int j = 0; j<log.length; j++){
                 birthYear = log[j][0];
                deathYear = log[j][1];
                if(birthYear <= i && i < deathYear){
                    count++;
                }
            }
            if(count > MaxPeople){
                MaxPeople = count;
                answerYear = i;
            }


        }
        System.out.println(answerYear);
        
    }
}