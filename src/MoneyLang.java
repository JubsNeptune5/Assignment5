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

    public MoneyLang() {
        words = new char[1];
        numItems = 0;
    }

    /**
     * Check if the word follows the language pattern
     *
     * @param word THe word to check the pattern of
     * @return A boolean
     */
    public boolean inLang(String word) {
        //Go throught each char in the string
        for (int i = 0; i < word.length(); i++) {
            //check if the there is space in the array words to store chars
            if (numItems < words.length) {
                //Insert char at corresponding location
                words[i] = word.charAt(i);
                numItems++;
            } else {
                //Create new array with double thsize
                char[] temp = new char[words.length + 1];
                //go throught the new array and move the corresponding char values thathose positions
                for (int j = 0; j < words.length; j++) {
                    temp[j] = words[j];
                }
                //Make the temp array equal the original array
                words = temp;
                words[i] = word.charAt(i);
                numItems++;
            }
        }
        //Check if there is a dollar sign in the middle of the word
        if (words[(numItems - 1) / 2] == '$') {
            //go thought hte positions of the array
            for (int i = 0; i < words.length; i++) {
                //Break through the loop if the chars on each side of the word closing in, doesnt equal zero 
                if (words[i] != words[(numItems - 1) - i]) {
                    
                    break;
                }
                //Return true if the loop doesn't break 
                return true;
            }
        }
        //Return fals eif the loop does break
        return false;
    }
}
