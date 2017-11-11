/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laveh2107
 */
public class MoneyLang {
    private char[] words;
    private int numItems;
    
    public MoneyLang(){
         words = new char[1];
        numItems = 0;
    }
    
    public boolean inLang(String word){
        for (int i = 0; i < word.length(); i++) {
            if (numItems< words.length) {
                words[i] = word.charAt(i);
                numItems++;
            }else{
                char[] temp = new char[words.length+1];
                for (int j = 0; j < words.length; j++) {
                    temp[j] = words[j];
                }
                words = temp;
                words[i] = word.charAt(i);
            numItems++;
            }
        }
//        for (int i = 0; i < words.length; i++) {
//            
//            System.out.println(words[i]);
//        }

if(words[(numItems-1)/2] == '$'){
     for (int i = 0; i < words.length; i++) {
        if(words[i] != words[(numItems-1)-i]){
            System.out.println("words at i: "+words[i]);
            System.out.println("Words at numitems - 1 -i: "+words[(numItems-1)-i]);
            break;
        }
        return true;
    }
}
        return false;
    }
}
