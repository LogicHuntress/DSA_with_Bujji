/* Take 2 numbers as input and find their HCF and LCM.

START 

START

INPUT num1
INPUT num2

hcf = 1

IF num1 < num2
    small = num1
ELSE
    small = num2

FOR i = 1 TO small

    IF(num1 % i == 0 AND num2 % i == 0)

        hcf = i

lcm = (num1 * num2) / hcf

OUTPUT hcf
OUTPUT lcm

END


 */