import Day2_OO.Article;
import OtherPac.Accumul;
import OtherPac.Line;

import java.util.Scanner;

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
        System.out.print("\n\nMaximum: " + ex1point1H_MAX(myArray) + "\n");
        // test
        zadanie5Day2();
        zadanie6Day2();
        // zadanie 7 Day 2
        int[] tab = {1, 6, 4, 12, 13, 66, 44};
        System.out.println("\n" + zadanie7Day2(tab, 6));
        System.out.println("\n" + zadanie7Day2(tab, 13));
        System.out.println("\n" + zadanie7Day2(tab, 22) + "\n");

        // zadanie 8
        // zadanie8_Calculator();
        // OO
        Article a = new Article(1, "watter bottle", 99, "Pure clean mineral watter");
        a.printInfo();
        a.setDescripton("Nowy opis");


        //Order order = new Order();

        System.out.println(Accumul.accum("abcd"));
        System.out.println(Accumul.accum("RqaEzty"));
        System.out.println(Accumul.accum("cwAt"));
        System.out.println(Line.Tickets(new int[]{25, 25, 50}));
        System.out.println(Line.Tickets(new int[]{25, 25, 25, 25, 50, 100, 50}));
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


        if (myArray.length > 0) {
            minimum = myArray[0];
        }
        // oblicz minimum
        for (int i = 0; i < myArray.length; i++) {
            if (minimum > myArray[i]) {
                minimum = myArray[i];
            }


        }

        return minimum;
    }

    public static double ex1point1H_MAX(int[] myArray) {
        // oblicza maximum
        double max = 0;


        if (myArray.length > 0) {
            max = myArray[0];
        }
        // oblicz max
        for (int i = 0; i < myArray.length; i++) {
            if (max < myArray[i]) {
                max = myArray[i];
            }


        }

        return max;
    }


    public static void zadanie5Day2() {
        String[] myStringArray = {"raz", "dwa", "trzy", "cztery", "piec", "szesc"};

        for (int i = 0; i < myStringArray.length; i++) {
            System.out.print(myStringArray[i] + " , ");
        }

        System.out.print("\nLoop 2:\n");
        int counter = 0;
        while (counter < myStringArray.length) {

            System.out.print(myStringArray[counter] + " , ");
            counter++;
        }


    }


    public static void zadanie6Day2() {
        System.out.println("\n");

        int[][] values = {{3, 8, 16}, {1, 22, 28, 24}, {3}, {41, 42}};

        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < values.length; i++) {

            for (int j = 0; j < values[i].length; j++) {
                if (values[i][j] > maximum) {
                    maximum = values[i][j];
                }

                if (values[i][j] < minimum) {

                    minimum = values[i][j];
                }

            }

        }

        System.out.println("Minimum:" + minimum + "\n");
        System.out.println("Maximum:" + maximum + "\n");
    }

    public static int zadanie7Day2(int[] tab, int x) {
        for (int i = 0; i < tab.length; i++) {

            if (tab[i] % x == 0) {
                return i;

            }
        }

        return -1;
    }

    public static void zadanie8_Calculator() {
        System.out.println("\n\n\n");
        System.out.println("Witaj, \nTo jest calculator. \nPodaj pierwsza liczbe do kalkulacji:\n");
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        System.out.println("Podaj operator jeden z: \"x\" albo \"/\" albo \"+\" albo \"-\" \n");
        String operator = scanner.next();
        System.out.println("Podaj druga liczbe do kalkulacji");
        int b = Integer.parseInt(scanner.next());


        int result = 0;
        switch (operator) {
            case "x":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            default:
                System.out.println("Operator nie jest suportowany");
                break;
        }

        System.out.println(" " + a + operator + b + "=" + result);

    }
}
