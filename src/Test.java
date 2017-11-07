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
        OrderedList list  = new OrderedList();
        list.add(2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
       list.add(1);
       for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.add(1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
    }
}
