/**
 * Created by tganc on 19/08/2017.
 */
public class FirstProgram {

    static int[] myArray = {12, 43, 77, 0, -34, -1, 2};

    public static void main(String[] args) {
        System.out.print("TEST");
        System.out.print("\nHello World");
        System.out.print("\nAfter Git set up");
        System.out.print("\nAfter Git set up 2 test2");

        System.out.print("\n\nNumber of positive elements: " + ex1point1A(myArray));
        System.out.print("\n\nAverage: " + ex1point1F(myArray));
        System.out.print("\n\nMinimum: " + ex1point1H(myArray));
        System.out.print("\n\nMaximum: " + ex1point1H_MAX(myArray));
        // test
    }

    public static int ex1point1A(int[] myArray) {
        int Result = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > 0) {
                Result++;
            }
        }

        return Result;

    }

    public static double ex1point1F(int[] myArray) {

        double sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }

        return sum / myArray.length;


    }

    public static double ex1point1H(int[] myArray) {
        double minimum = 0;


        if (myArray.length>0) {
            minimum=myArray[0];
        }
        // oblicz minimum
        for (int i = 0; i <myArray.length; i++) {
            if (minimum>myArray[i])
            {minimum = myArray[i];}


        }

        return minimum;
    }

    public static double ex1point1H_MAX(int[] myArray) {
        // oblicza maximum
        double max = 0;


        if (myArray.length>0) {
            max=myArray[0];
        }
        // oblicz max
        for (int i = 0; i <myArray.length; i++) {
            if (max<myArray[i])
            {max = myArray[i];}


        }

        return max;
    }
}
