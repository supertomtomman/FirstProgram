package Day4;

import java.util.ArrayList;
import java.util.Stack;

public class CollectionReview {
    public static void main(String[] args) {
         ArrayList<Integer> numbers = new ArrayList<Integer>();
         numbers.add(5);
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(7);
        stack.push(9);
        stack.push(1);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

    }


    private static void mapaLicznik(){

    }
}
