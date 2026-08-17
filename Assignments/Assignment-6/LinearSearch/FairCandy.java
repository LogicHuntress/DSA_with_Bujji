
/*https://leetcode.com/problems/fair-candy-swap/description/
//pusedocode
START
INPUT ALICESIZE 
INPUT BOBSIZE
INPUT ALICETOTAL = 0;
INPUT BOBTOTAL = 0;
FOR I = 0 TO ALICESIZE
aliceTotal += alice[i] END 
FOR J = 0; TO BOBSIZE 
bobTotal += bob[j]END

FOR I = 0 TO ALICESIZE 
FOR J = 0; TO BOBSIZE

INPUT  A = ALICESIZE[I];
INPUT B = BOBSIZE[J];

INPUT NEWALICE = ALICETOTAL - A + B; 
INPUT NEWBOB = BOBTOTAL -B + A

IF(NEWALICE = NEWBOB)
PRINT ARRAY
END ALL LOOPS AND IF
RETURN 0 
END



*/public class FairCandy {
    public static void main(String[] args) {
        int[] alice = {1, 1};
        int[] bob = {2, 2};

        int aliceTotal = 0;
        int bobTotal = 0;

        for (int i = 0; i < alice.length; i++) {
            aliceTotal += alice[i];
        }

        for (int j = 0; j < bob.length; j++) {
            bobTotal += bob[j];
        }

        for (int i = 0; i < alice.length; i++) {
            for (int j = 0; j < bob.length; j++) {

                int a = alice[i];
                int b = bob[j];

                int newAlice = aliceTotal - a + b;
                int newBob = bobTotal - b + a;

                if (newAlice == newBob) {
                    System.out.println("Fair candy becomes: [" + a + ", " + b + "]");
                    return;
                }
            }
        }

        System.out.println("No fair candy swap found.");
    }
}