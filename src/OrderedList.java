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
    private int[] items;

    public OrderedList() {
        head = null;
        numItems = 0;
        items = new int[numItems + 1];
    }

    /**
     * Adds a number to the list in order smallest to largest
     *
     * @param num the number put into the list
     */
    public void add(int num) {

        //Statr at beginning of the list
        IntNode node = head;
        IntNode temp = new IntNode(num);
        //See if first item is at the start
        if (node == null) {
            System.out.println("TEST 5");
            head = temp;
        } else {
            if (num < head.getNum()) {
                System.out.println("TEST@");
                IntNode p = head;
                head = temp;
                System.out.println("Head: " + head.getNum());
                head.setNext(p);
                System.out.println("head next: " + head.getNext().getNum());
            } else {
                if (node.getNext() == null) {
                    System.out.println("TWST1");
                    System.out.println("Temp; " + temp.getNum());

                    node.setNext(temp);
                    System.out.println("Node.setNext(temp)" + node.getNext().getNum());
                } else {
                    System.out.println("TEST");
                    while (node.getNext().getNum() < num) {
                        node = node.getNext();
                        if (node.getNext() == null) {
                            break;
                        }
                    }
//        Insert it into the list
                    IntNode p = node.getNext();
                    temp.setNext(p);
                    node.setNext(temp);
                }
            }
        p
        }
        //Increase the size counter
        numItems++;
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

    public void remove(int num) {
        IntNode temp = head;
        IntNode prev = null;
        while (temp != null) {
            if(temp.getNum() == num){
                if(temp ==head){
                    head=head.getNext();
                }else{
                    prev.setNext(temp.getNext());
                }
                
            }else{
                prev=temp;
            }
            temp = temp.getNext();
        }
        numItems--;
    }
}
