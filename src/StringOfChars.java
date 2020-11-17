/**
 * Chars are quite useful for most applications, but sometimes, you need a lot of them
 * Then variable naming can get confusing and char arrays are a bit too complicated to effectively work with
 * That's when you should use StringOfChars, it stores a String (or Array) or chars and can be used very easily.
 */
public class StringOfChars {

    private char[] string;

    /**
     * Create a new StringOfChars from lots of tiny cute chars (also called an 'array')
     * @param letters
     */
    public StringOfChars(char ... letters){
        this.string = letters;
    }

    /**
     * If you want to actually use the StringOfChars for anything (which you don't want to)
     * @return The S T R I N G
     */
    public String toString(){
        return new String(string);
    }

    /**
     * Get the char array itself
     * @return The char array
     */
    public char[] toCharArray(){
        return string;
    }

    /**
     * The length of the char array
     * @return The length as an integer
     */
    public int length(){
        return string.length;
    }

    /**
     * Get a single char at an index i
     * @param i The index
     * @return The Char
     */
    public char atIndex(int i){
        return string[i];
    }

    /**
     * Append another char array
     * @param chars The char array that should be appended
     */
    public void append(char ... chars){
        append(new StringOfChars(chars));
    }

    /**
     * Append another StringOfChars
     * @param string2 The StringOfChars
     */
    public void append(StringOfChars string2){
        char[] newString = new char[this.length() + string2.length()];

        System.arraycopy(string, 0, newString, 0, this.length());
        System.arraycopy(string2.toCharArray(), 0, newString, this.length(), string2.toString().length());

        string = newString;
    }



}
