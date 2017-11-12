/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laveh2107
 */
public class A5Q2 {

    private int[] array;
    private int numItems;

    public A5Q2() {
        array = new int[10];
        numItems = 0;
    }

    /**
     * Add the number into the array and constantly make th array bigger when
     * need be
     *
     * @param index the position in the array the number will go into
     * @param num the number to be put in the array
     */
    public void add(int index, int num) {
        //Check if the position is less than the length of the array
        if (index < array.length) {
            //Set the array at position to be the numebr
            array[index] = num;
            numItems++;
        } else {
            //When the psotion that is being looken for is not in the current array
            while (index >= array.length) {
                //Create a temperary array wihtt he size ot be double of the array
                int[] temp = new int[array.length * 2];
                //Move the values in array to the corresponding position in the temp array 
                for (int i = 0; i < array.length; i++) {
                    temp[i] = array[i];
                }
                //Make the temp array become the array
                array = temp;
            }
            //Once the array is sized to fit the position, set the number at that position
            array[index] = num;
            numItems++;
        }
    }

    /**
     * Remove the number at a position
     *
     * @param index The position at which the number will be removed
     */
    public void remove(int index) {
        //If theposition isin the array, set the array value to 0
        if (index < array.length) {
            array[index] = 0;
        }
    }

    /**
     * Method to tel the size of the list
     *
     * @return
     */
    public int size() {
        return numItems;
    }

    /**
     * Method to see if the list is empty
     *
     * @return
     */
    public boolean isEmpty() {
        if (numItems == 0) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Find the value at a position of the list
     *
     * @param index the position
     * @return The value at the position
     */
    public int get(int index) {
        //Check if the index is in the array
        if (index < array.length) {
            return array[index];
        } else {
            return -1;
        }
    }
}
