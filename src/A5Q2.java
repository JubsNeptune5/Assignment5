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
    
    public A5Q2(){
    array = new int[10];
    numItems = 0;
}
    public void add(int index, int num){
        if(index<array.length){
            array[index] = num;
            numItems++;
        }else{while(index>array.length){
            int[] temp = new int[array.length*2];
            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }
            System.out.println(array.length);
            array = temp;
            
        }
        
        
    }}
    public void remove(int index){
        
    }
    public int size(){
        return 1;
    }
    public boolean isEmpty(){
        return true;
    } 
    public void get(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
