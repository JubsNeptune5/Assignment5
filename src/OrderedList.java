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

        } else if (num < head.getNum()) {
            IntNode p = head;
            head = temp;
            System.out.println("Head: "+head.getNum());
            head.setNext(p);
            System.out.println("head next: "+head.getNext().getNum());
        } else {
            while (num > node.getNum()) {
                System.out.println("num: "+num);
                System.out.println("Node: "+node.getNum());
                node = node.getNext();
                if (node.getNext() == null) {
                    break;
                }
            }
        }
//        } else if (num > head.getNum()) {
//            while (node.getNext().getNum() < num) {  //NOTE Temp is num/node is<num
//                if (node.getNext() == null) {
//                    node.setNext(temp);
//                    break;
//                }
//                //travel to the next node
//                node = node.getNext();
//            }
//        }
//        //travel to the end
//
//         Node is the last node on the list
        IntNode temp2 = new IntNode(num);
//        Insert it into the list
        temp.setNext(temp2);



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
