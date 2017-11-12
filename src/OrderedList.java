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
/**
 *
 */
    public OrderedList() {
        head = null;
        numItems = 0;
    }

    /**
     * Adds a number to the list in order smallest to largest
     *
     * @param num the number put into the list
     */
    public void add(int num) {
        //Create node for the head and the number
        IntNode node = head;
        IntNode temp = new IntNode(num);
        //Check if this is the first number to be in the list
        if (node == null) {
            head = temp;
        } else{
            //Check if the number issmaller than the head
            if (num < head.getNum()) {
                //Create a seperate node for the value of the head
                IntNode p = head;
                //Switch the number to be the head and set the number back a row
                head = temp;
                head.setNext(p);
            } else {
                //check if there is a next number in the list
                if (node.getNext() == null) {
                    //set the next node to be the temp
                    node.setNext(temp);
                } else {
                    //while the next node is less than the number
                    while (node.getNext().getNum() < num) {
                        //move the value of node up the places tilll the loop is false
                        node = node.getNext();
                        //Check if the lsit has reached it's last place
                        if (node.getNext() == null) {
                            break;
                        }
                    }
                    //Insert it into the list
                    IntNode p = node.getNext();
                    temp.setNext(p);
                    node.setNext(temp);
                }
            }
            
        }
        //Increase the size counter
        numItems++;
    }
/**
 * State the size of the list
 * @return Size of the lsit
 */
    public int size() {
        return numItems;
    }
/**
 * check if the list is empty
 * @return boolean weither or not its empty
 */
    public boolean isEmpty() {
        if(numItems==0){
            return true;
        }else{
            return false;
        }
    }
/**
 * Find the value at a position of the list
 * @param index the position
 * @return The value at the position
 */
    public int get(int index) {
        IntNode node = head;
        //Go throught the positions before the position needed 
        for (int i = 0; i < index - 1; i++) {
            node = node.getNext();
        }
        //return the value
        return node.getNum();
    }
/**
 * Method to remove the firstnumber that is givin in the list
 * @param num the number wanting to get rid of
 */
    public void remove(int num) {
        //Create nodes to represent the values of head and null
        IntNode temp = head;
        IntNode prev = null;
        //Check if the temperary node has a value
        while (temp != null) {
            //Check if the head is the number
            if(temp.getNum() == num){
                //Check if the temp is the head
                if(temp ==head){
                    //Make the value ofhead equal to the value after that
                    head=head.getNext();
                }else{
                    //Set the next value of the previous node to the value after the head
                    prev.setNext(temp.getNext());
                }
                
            }else{
                //make the previous equal the temp
                prev=temp;
            }
            //Make the temperary equal the value after that
            temp = temp.getNext();
        }
        //Lower the number in the list
        numItems--;
    }
}
