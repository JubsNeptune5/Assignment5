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
        //See if first item is at the start
        if (node == null) {
            IntNode temp = new IntNode(num);
            head = temp;
        } else if (node.getNum() < num) {
            IntNode temp1 = head;
            head = node;
            while (temp1.getNum() <= num && temp1.getNext() != null) {
                //travel to the next node
                temp1 = temp1.getNext();
            }
            // Node is the last node on the list
            IntNode temp = new IntNode(num);
            //Insert it into the list
            node.setNext(temp);
        } else {
            //travel to the end
            while (node.getNum() <= num && node.getNext() != null) {
                //travel to the next node
                node = node.getNext();
            }
            // Node is the last node on the list
            IntNode temp = new IntNode(num);
            //Insert it into the list
            node.setNext(temp);

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
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getNum();
    }
}
