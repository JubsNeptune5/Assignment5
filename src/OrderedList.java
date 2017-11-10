/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laveh2107
 */
public class OrderedList {

    private IntNode head;
    private int numItems;

    public OrderedList() {
        head = null;
        numItems = 0;
    }

    public void add(int num) {

        //Statr at beginning of the list
        IntNode node = head;
        IntNode temp = new IntNode(num);
        //See if first item is at the start
        if (node == null) {
            head = temp;
        } else {
            if (num < head.getNum()) {
            IntNode p = head;
            head = temp;
            System.out.println("Head: " + head.getNum());
            head.setNext(p);
            System.out.println("head next: " + head.getNext().getNum());
        } else {
            System.out.println("TEST");
            IntNode a = null;
                while (node != null&&num > node.getNum()) {
                    System.out.println("num: " + num);
                    System.out.println("Node: " + node.getNum());
                    node = node.getNext();
                   
                }
//        Insert it into the list
            temp.setNext(node);
            a.setNext(temp);
            }
        }

        //Increase the size counter
        numItems++;
    }

    public int remove(int num) {
        return 0;
    }

    public int size() {
        return numItems;
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

    public int get(int index) {
        IntNode node = head;
        //move the number of times 
        for (int i = 0; i < index - 1; i++) {
            node = node.getNext();
        }
        return node.getNum();
    }
}
