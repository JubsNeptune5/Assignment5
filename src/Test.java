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
        list.add(1);
        list.add(4);
        list.add(5);
        list.remove(1);
        for (int i = 0; i < list.size()+1; i++) {
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
        
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

        System.out.println("");
        System.out.println("Question 3");
        MoneyLang lang = new MoneyLang();
        if(lang.inLang("bearhujndklfsdds") == true){
            System.out.println("The word is apart of the language");
        }else{
            System.out.println("The word isn't apart of the language");
        }
        

    }
}