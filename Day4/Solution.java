package Day4;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] c = {10, 2, 3, 3};
        System.out.println("Total time: " + solveSuperMarketQueue(c, 2));
    }


    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] tills = new int[n];
        int nextTill = -1;
        for (int i = 0; i < tills.length; i++) {
            tills[i] = 0;
        }

        for (int i = 0; i < customers.length; i++) {

            nextTill = getMin(tills);
            tills[nextTill] += customers[i];
        }

        return getMax(tills);
    }

    private static int getMax(int[] tills) {
        int tempMax = Integer.MIN_VALUE;


        for (int i = 0; i < tills.length; i++) {
            if (tempMax < tills[i]) {
                tempMax = tills[i];

            }

        }
        return tempMax;
    }

    private static int getMin(int[] tills) {
        int minimum = Integer.MAX_VALUE;
        int pos = Integer.MAX_VALUE;

        for (int i = 0; i < tills.length; i++) {
            if (minimum > tills[i]) {

                minimum = tills[i];
                pos = i;
            }

        }
        return pos;
    }
}
