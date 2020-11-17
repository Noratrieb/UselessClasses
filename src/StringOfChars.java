/**
 * Chars are quite useful for most applications, but sometimes, you need a lot of them
 * Then variable naming can get confusing and char arrays are a bit too complicated to effectively work with
 * That's when you should use StringOfChars, it stores a String (or Array) or chars and can be used very easily.
 */
public class StringOfChars {

    private char[] string;

    public StringOfChars(char ... letters){
        this.string = letters;
    }

    public String toString(){
        return new String(string);
    }

    public char[] toCharArray(){
        return string;
    }

    public int length(){
        return string.length;
    }

    public char get(int i){
        return string[i];
    }

    public void append(char ... chars){
        append(new StringOfChars(chars));
    }

    public void append(StringOfChars string2){
        char[] newString = new char[this.length() + string2.length()];

        System.arraycopy(string, 0, newString, 0, this.length());

        System.arraycopy(string2.toCharArray(), 0, newString, this.length(), string2.toString().length());

        string = newString;
    }



}
