
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

    // String foo = "";
    // foo = baseValue + vTBA;
    // return foo;

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
//        StringBuilder sb = new StringBuilder(valueToBeReversed);
//        sb.reverse();
//        return sb.toString();
        return new StringBuilder(valueToBeReversed).reverse().toString();
    }

    // String rev = "";
    // char ch;
    // for i = vTBR.len - 1; i >= 0; i--
    //  ch = vTBR.charAt(i);
    //  rev += ch;
    // return rev;

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        return word.charAt(word.length() / 2);
    }

    // char ch;
    // ch = word.charAt(word.len / 2);
    // return ch;

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        return value.replace(charToRemove.toString(), "");
    }

    // return value.replace(charToRemove.toString(), "");

    // char[] charr = value.charArray
    // String result = "";
    // for i = 0; i < value.array len ; i++
    //  if charr[i] != charToRemove
    //   result += charr[i]
    // return result;

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] sa = sentence.split(" ");

        return sa[sa.length - 1];
    }
    public String getFirstWord(String sentence) {
        String[] sa = sentence.split(" ");

        return sa[0];
    }
    public String getSecondWord(String sentence) {
        String[] sa = sentence.split(" ");

        return sa[1];
    }
    public String getSecondLastWord(String sentence) {
        String[] sa = sentence.split(" ");

        return sa[sa.length - 2];
    }



}
