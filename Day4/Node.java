package Day4;

import java.util.ArrayList;
import java.util.function.Predicate;
/*

public class Node<T> {

     Object data;
     Node next;

    Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(Object data) {
        this(data, null);
    }

}




class Solution1 {


    static <T> Node<T> filter(Node<T> head, Predicate<T> p) {

        ArrayList<T> tempStorage = new ArrayList<>();

        while (head != null) {
            if (p.test(head.data)) {
                tempStorage.add(head.data);
            }
            head = head.next;

        }

        if (tempStorage.size() < 1) {
            return null;
        }

        Node<T> tempNodes = new Node(tempStorage.get(0));
        Node<T> resultNodes = tempNodes;
        if (tempStorage.size() > 1) {
            for (int i = 1; i < tempStorage.size(); i++) {
                tempNodes.next = new Node(tempStorage.get(i));
                tempNodes = tempNodes.next;

            }
        }
        return resultNodes;
    }

//    private static <T> Node<T> addNode(Node<T> newHead, Node<T> head) {
//
//        Node<T> result = newHead;
//        while(newHead!=null){
//            if(newHead.next==null){
//                newHead.next= new Node(head.data);
//            }
//
//        }
//        return result;
//    }


    static <T> boolean anyMatch(Node<T> head, Predicate<T> p) {

        while(head!=null){
            if(p.test(head.data)){

                return true;
            }
            head=head.next;

        }

        return false;
    }

    static <T> boolean allMatch(Node<T> head, Predicate<T> p) {

        int myLength = length(head);
        int matches =0;

        while (head!=null){
            if(p.test(head.data)){
                matches++;
            }
            head=head.next;
        }

        return myLength==matches;
    }





    //---------

    static int length(Node head) {

        if (head==null){return 0;}
        return  length(head.next)+1 ;
    }

    static  int countIf(Node head, Predicate p) {

        int counter =0;
        while (head!=null){
            if(p.test(head.data)){
                counter++;
            }

        }
        return counter;
    }

}*/
