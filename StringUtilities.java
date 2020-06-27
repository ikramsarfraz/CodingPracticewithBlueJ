
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String reversed = "";
        int index = 0;
        // start from the last char and move towards the front of the word
        // add each char to new string
        for(int i = valueToBeReversed.length() - 1; i >= 0 ; i--){
            reversed  += valueToBeReversed.charAt(i);
            index++;
        }
        return reversed;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        // finds position of middle char and returns it
        return word.charAt(word.length() / 2); 
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String newValue = "";
        for(int i = 0; i < value.length(); i++){
            // if:    current char equals charToRemove
            // then: do nothing
            // else: add to newValue
            if(value.charAt(i) != charToRemove) newValue += value.charAt(i);
        }
        return newValue;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        // find index of last space and return new string starting from next index
        return sentence.substring(sentence.lastIndexOf(" ") + 1);
    }
}
