/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laveh2107
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrderedList list = new OrderedList();
        System.out.println("Question 1");
        System.out.println("");
        list.add(2);
        list.add(3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }







        A5Q2 array = new A5Q2();
        System.out.println("");
        System.out.println("Question 2");
        System.out.println("");
        array.add(0, 0);
        array.add(1, 6);
        array.add(6, 5);
        for (int i = 2; i < 6; i++) {
            array.add(i, 0);
        }
        for (int i = 7; i < 32; i++) {
            array.add(i, 0);
        }

        array.add(33, 7);
//        
        array.get();

    }
}