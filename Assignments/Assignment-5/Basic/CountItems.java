/*https://leetcode.com/problems/count-items-matching-a-rule/
//pusedocode
START

INPUT items
INPUT ruleKey
INPUT ruleValue

COUNT = 0

FOR i = 0 TO items.length - 1

    IF ruleKey == "type"

        IF items[i][0] == ruleValue

            COUNT++

        END IF


    ELSE IF ruleKey == "color"

        IF items[i][1] == ruleValue

            COUNT++

        END IF


    ELSE IF ruleKey == "name"

        IF items[i][2] == ruleValue

            COUNT++

        END IF


END LOOP

RETURN COUNT

END
*/
public class CountItems {
    public static void main(String[] args) {
        String[][] items = {
            {"phone","blue","pixel"},
            {"computer","silver","lenovo"},
            {"phone","blue","iphone"}
        };
        String ruleKey = "color";
        String ruleValue = "blue";
        int count = 0;
        for(int i = 0; i<items.length;i++){
            if(ruleKey.equals("type")){
                if(items[i][0].equals(ruleValue)){
                    count++;
                }
            }else if(ruleKey.equals("color") ) {
                if(items[i][1].equals(ruleValue)){
                    count++;
                }
            } else if(ruleKey.equals("name")){
                 if(items[i][2].equals(ruleValue)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}