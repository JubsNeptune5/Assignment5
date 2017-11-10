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
        }else{while(index>=array.length){
            int[] temp = new int[array.length*2];
            for (int i = 0; i < array.length; i++) {
                int t = i;
                if(array[i]==0){
                    t = i++;
                }
                temp[i] = array[t];
            }
            System.out.println(array.length);
            array = temp;
            
        }
        array[index] = num;
            numItems++;
        
    }
    
    }
    public void remove(int index){
        if(index<array.length){
            array[index] = 0;
        }
    }
    public int size(){
        return 1;
    }
    public boolean isEmpty(){
        if (numItems == 0) {
            return true;
        }else{
            return false;
        }
        
    } 
    public void get(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
